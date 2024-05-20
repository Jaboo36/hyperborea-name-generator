package names

object AmazonNames {
    fun generateFullName(isFemale: Boolean = false): String {
        return "${generateFirstName(isFemale)} ${generateLastName()}"
    }

    private fun generateFirstName(isFemale: Boolean = false): String = if (!isFemale) {
        personalNamesMale.random()
    } else {
        personalNamesFemale.random()
    }

    private fun generateLastName(): String = personalNamesFemale
        .random()
        .let {
            val suffix = getSuffix(it)
            it.dropLast(suffix.length) + suffix
        }

    private fun getSuffix(name: String) = matronymicModifications
        .asSequence()
        .firstOrNull { name.endsWith(it.key) }
        ?.value
        ?: ""


    private val personalNamesFemale = setOf(
        "Astrasteia",
        "Aella",
        "Agathe",
        "Agaue",
        "Aglaia",
        "Akantha",
        "Alekto",
        "Alexandra",
        "Alexia",
        "Alkippe",
        "Althaia",
        "Ambrosia",
        "Andromeda",
        "Aristomache",
        "Artemisia",
        "Astraia",
        "Athanasia",
        "Athanais",
        "Demetria",
        "Demostrate",
        "Eudoxia",
        "Eugenia",
        "Eulalia",
        "Eunike",
        "Euphemia",
        "Euphrasia",
        "Eupraxia",
        "Eutropia",
        "Gaiane",
        "Galene",
        "Helene",
        "Hypatia",
        "Iphigeneia",
        "Kallisto",
        "Kallistrate",
        "Kleio",
        "Lysistrate",
        "Pelagia",
        "Pherenike",
        "Phoibe",
        "Photine",
        "Ptolemais",
        "Sophia",
        "Sostrate",
        "Theodora",
        "Theodosia",
        "Xanthe",
        "Xanthippe",
        "Zenais",
        "Zosime"
    )

    private val personalNamesMale = setOf(
        "Agapios",
        "Agathon",
        "Apollonios",
        "Argyros",
        "Bion",
        "Chrysanthos",
        "Demetrios",
        "Dionysios",
        "Euphranor",
        "Galenos",
        "Hesperos",
        "Kallias",
        "Linos",
        "Lysandros",
        "Photios",
        "Simonides",
        "Thales",
        "Theodosios",
        "Zenobios",
        "Zenon"
    )

    private val matronymicModifications = mapOf(
        "dra" to "doros",
        "e" to "edoros",
        "ia" to "idoros",
        "o" to "odoros"
    )
}