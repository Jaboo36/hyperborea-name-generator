import names.Race
import java.io.File
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
        val names = number
            ?.let { (0 until number).joinToString("\n") { generateName(race, gender) } }
            ?: ""
        if (PATH.exists()) {
            PATH.toFile().appendText("\n${names}")
        } else {
            PATH.toFile().writeText(names)
        }
        generateMoreNames()
    }

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

    private fun numberOfNames(): Int? {
        println("How many names would you like to generate?")
        print("Choose a number between 1 and 50: ")
        return tryGetNumberInputOrNull(NOT_BETWEEN_1_AND_50)
            ?.let {
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
            ?: numberOfNames()
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

    private fun getRaceInput(): Int = tryGetNumberInputOrNull(INVALID_CHOICE)
        ?.let {
            if (it !in 1..Race.entries.size) {
                println(INVALID_CHOICE)
                getRaceInput()
            } else {
                it
            }
        }
        ?: getRaceInput()

    private fun chooseGender(): Int {
        println(
            """
        Choose a gender. Your options are:
        1) Male
        2) Female
    """.trimIndent()
        )
        val choice = tryGetNumberInputOrNull(INVALID_CHOICE)
        return if (choice !in  1..2) {
            println(INVALID_CHOICE)
            chooseGender()
        } else choice ?: chooseGender()
    }

    fun generateName(race: Int, gender: Int): String {
        val isFemale = gender == 2
        return Race.entries[race - 1].generateName(isFemale)
    }




    private fun tryGetNumberInputOrNull(errorMessage: String): Int? = try {
        readln().toInt()
    } catch (_: NumberFormatException) {
        println(errorMessage)
        null
    }
}