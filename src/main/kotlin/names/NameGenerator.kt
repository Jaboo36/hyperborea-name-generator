package names

interface NameGenerator {
    fun generateName(isFemale: Boolean?): String
}