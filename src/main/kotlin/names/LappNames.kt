package names

object LappNames {

    fun generateName(isFemale: Boolean = false): String = if (isFemale) {
        "${femaleNames.random()} of the ${clanNames.random()} Clan"
    } else {
        "${maleNames.random()} of the ${clanNames.random()} Clan"
    }

    private val femaleNames = setOf(
        "Ada",
        "Aliissa",
        "Amanda",
        "Asta",
        "Elle",
        "Eva",
        "Flora",
        "Gunna",
        "Helena",
        "Helga",
        "Inger",
        "Meret",
        "Mimmi",
        "Nina",
        "Olga",
        "Ristiinna",
        "Sonja",
        "Sussu",
        "Unni",
        "Venla"
    )

    private val maleNames = setOf(
        "Aggi",
        "Ammon",
        "Avgos",
        "Bihto",
        "Davgon",
        "Duomis",
        "Einar",
        "Guivi",
        "Hegon",
        "Holger",
        "Hugo",
        "Ivvar",
        "Jonas",
        "Lagon",
        "Morte",
        "Niikko",
        "Otto",
        "Sabba",
        "Viktor",
        "Volbmar"
    )

    private val clanNames = setOf(
        "Bear",
        "Elk",
        "Fox",
        "Wolf"
    )
}