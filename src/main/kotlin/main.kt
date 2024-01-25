import names.*

fun main() {
    nameGenerator()
}

fun nameGenerator() {
    val race = chooseRace()
    val gender = chooseGender()
    val number = numberOfNames()
    if (number == 1) {
        println(generateName(race, gender))
    } else {
        repeat(number) {
            println(generateName(race, gender))
        }
    }
    generateMoreNames()

}

tailrec fun generateMoreNames() {
    println("\nWould you like to generate more names?")
    print("y/n ")
    val answer = readln().lowercase()
    when (answer) {
        "y" -> nameGenerator()
        "n" -> return
        else -> {
            print("This is not a valid input. Please enter 'y' or 'n': ")
            generateMoreNames()
        }
    }
}

fun numberOfNames(): Int {
    println("How many names would you like to generate?")
    print("Choose a number between 1 and 50: ")
    val number = try {
        readln().toInt()
    } catch (_: NumberFormatException) {
        print(NOT_BETWEEN_1_AND_50)
        numberOfNames()
    }
    return when {
       number < 1 -> {
           println("This input is less than 1. Defaulting to 1 name.")
           1
       }
        number > 50 -> {
            println("This input is more than 50. Defaulting to 50 names.")
            50
        }
        else -> number
    }
}

fun chooseRace(): Int {
    println(
        """
        Choose a race to generate a name for. Enter one of the numbers for the corresponding races below. 
        Your options are:
        1) Common
        2) Amazon
        3) Anglo-Saxon
        4) Atlantean
        5) Carolingian Frankish
        6) Esquimaux
        7) Esquimaux-Ixian
        8) Greek
        9) Hyperborean
        10) Ixian
        11) Keltic
        12) Kimmerian
        13) Kimmerian (Krimmean)
    """.trimIndent()
    )
    val raceInput = getRaceInput()
    return raceInput
}

fun getRaceInput(): Int {
    val choice = try {
        readln().toInt()
    } catch (_: NumberFormatException) {
        println(INVALID_CHOICE)
        getRaceInput()
    }
    return if (choice !in 1..27) {
        println(INVALID_CHOICE)
        getRaceInput()
    } else {
        choice
    }
}

fun chooseGender(): Int {
    println(
        """
        Choose a gender. Your options are:
        1) Male
        2) Female
    """.trimIndent()
    )
    val choice = try {
        readln().toInt()
    } catch (_: NumberFormatException) {
        println(INVALID_CHOICE)
        chooseGender()
    }
    return if (choice !in 1..2) {
        println(INVALID_CHOICE)
        chooseGender()
    } else {
        choice
    }
}

fun generateName(race: Int, gender: Int): String {
    val isFemale = gender == 2
    return when (race) {
        1 -> CommonNames().generateFullName(isFemale)
        2 -> AmazonNames().generateFullName(!isFemale)
        3 -> AngloSaxonNames().generateName(isFemale)
        4 -> AtlanteanNames().generateName(isFemale)
        5 -> CarolingianFrankishNames().generateName(isFemale)
        6 -> EsquimauxNames().generateName()
        7 -> EsquimauxIxianNames().generateName()
        8 -> GreekNames().generateName(isFemale)
        9 -> HyperboreanNames().generateName(isFemale)
        10 -> IxianNames().generateName(isFemale)
        11 -> KelticNames().generateName(isFemale)
        12 -> KimmerianNames().generateName(isFemale)
        13 -> KimmerianNames().generateKrimmeanName(isFemale)
        else -> CommonNames().generateFullName(isFemale)
    }
}

const val INVALID_CHOICE = "This is not a valid option. Please enter a number from the list."
const val NOT_BETWEEN_1_AND_50 = "This is not a valid input. Please choose a number between 1 and 50."