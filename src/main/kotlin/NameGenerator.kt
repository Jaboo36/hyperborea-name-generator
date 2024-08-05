import names.Race
import java.io.File
import java.io.UnsupportedEncodingException
import kotlin.io.path.*

object NameGenerator {

    private val PATH = Path("generatedNames.txt")
    private val OLD_PATH = Path("OLD_generatedNames.txt")
    private const val INVALID_CHOICE = "This is not a valid option. Please enter a number from the list."
    private const val NOT_BETWEEN_1_AND_50 = "This is not a valid input. Please choose a number between 1 and 50."

    init {
        println("starting name generator")
        when {
            PATH.exists() && OLD_PATH.exists() -> {
                OLD_PATH.deleteExisting()
                PATH.toFile()
                    .renameTo(File(OLD_PATH.name))
            }

            PATH.exists() -> PATH.toFile().renameTo(File(OLD_PATH.name))
        }
        run()
        println("closing name generator")
    }

    private fun run() {
        val race = chooseRace()
        val gender = chooseGender()
        val number = numberOfNames()
        val names = generateNames(
            number = number,
            race = race,
            gender = gender
        ).joinToString("\n") { it }
        try {
            if (PATH.exists()) {
                PATH.toFile()
                    .appendText(names)
                    .also { println("adding names:\n$names\nto '$PATH'...") }
            } else {
                PATH.toFile()
                    .writeText(names)
                    .also { println("creating file '$PATH' and adding names: \n$names...") }
            }
        } catch (e: UnsupportedEncodingException) {
            println("Failed to create file from string '$PATH'")
        }
        generateMoreNames()
    }

    private fun generateNames(
        number: Int,
        race: Int,
        gender: Int
    ): List<String> = (1..number).map { generateName(race = race, gender = gender) }

    private tailrec fun generateMoreNames() {
        println("\nWould you like to generate more names?\ny/n: ")
        val answer = readln().lowercase()
        when (answer) {
            "y" -> run()
            "n" -> return
            else -> {
                print("This is not a valid input. Please enter 'y' or 'n': ")
                generateMoreNames()
            }
        }
    }

    private fun numberOfNames(): Int {
        println("How many names would you like to generate?")
        print("Choose a number between 1 and 50: ")
        return tryGetNumberInput(NOT_BETWEEN_1_AND_50)
            .getOrElse { numberOfNames() }
            .let {
                when {
                    it < 1 -> {
                        println("This input is less than 1. Defaulting to 1 name.")
                        1
                    }

                    it > 50 -> {
                        println("This input is more than 50. Defaulting to 50 names.")
                        50
                    }

                    else -> it
                }
            }
    }

    private fun getNamesList(): String {
        return Race.entries.joinToString("\n") { "${it.ordinal + 1}) ${it.raceName}" }
    }

    private fun chooseRace(): Int {
        println(
            """
        Choose a race to generate a name for. Enter one of the numbers for the corresponding races below. 
        Your options are:
    """.trimIndent()
        )
        println(getNamesList())
        val raceInput = getRaceInput()
        return raceInput
    }

    private fun getRaceInput(): Int = tryGetNumberInput(INVALID_CHOICE)
        .getOrElse { getRaceInput() }
        .let {
            if (it !in 1..Race.entries.size) {
                println(INVALID_CHOICE)
                getRaceInput()
            } else {
                it
            }
        }

    private fun chooseGender(): Int {
        println(
            """
        Choose a gender. Your options are:
        1) Male
        2) Female
    """.trimIndent()
        )
        return tryGetNumberInput(INVALID_CHOICE)
            .getOrElse { chooseGender() }
            .let {
                if (it !in 1..2) {
                    println(INVALID_CHOICE)
                    chooseGender()
                } else it
            }

    }

    fun generateName(race: Int, gender: Int): String {
        val isFemale = gender == 2
        return Race.entries[race - 1].generateName(isFemale)
    }


    private fun tryGetNumberInput(errorMessage: String): Result<Int> = try {
        Result.success(readln().toInt())
    } catch (nfe: NumberFormatException) {
        println(errorMessage)
        Result.failure(nfe)
    }
}