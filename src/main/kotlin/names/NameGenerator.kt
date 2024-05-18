package names

interface NameGenerator {
    fun generateName(gender: Boolean?): String
}