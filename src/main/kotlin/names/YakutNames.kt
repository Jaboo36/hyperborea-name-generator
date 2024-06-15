package names

import java.io.File

object YakutNames {
    private const val MALE_NAMES_PATH = "src/main/resources/yakutNamesMale.txt"
    private const val FEMALE_NAMES_PATH = "src/main/resources/yakutNamesFemale.txt"
    fun generateName(isFemale: Boolean) = if (isFemale) {
        File(FEMALE_NAMES_PATH)
            .readLines()
            .random()
    } else {
        File(MALE_NAMES_PATH)
            .readLines()
            .random()
    }
}