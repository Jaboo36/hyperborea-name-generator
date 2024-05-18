package names

object KelticNames {

    fun generateName(isFemale: Boolean = false): String = if (isFemale) generateFemaleName() else generateMaleName()

    private fun generateFemaleName(): String {
        val personal = femaleNames.random()
        val family = maleNames.random()
        return "$personal Inghean $family"
    }

    private fun generateMaleName(): String {
        val personal = maleNames.random()
        val family = maleNames.random()
        return "$personal Macc $family"
    }
    private val femaleNames = setOf(
        "Aine",
        "Ana",
        "Banbha",
        "Brianag",
        "Brighid",
        "Ceana",
        "Ceara",
        "Ciar",
        "Dairine",
        "Ealadha",
        "Echna",
        "Eithne",
        "Etain",
        "Fionuir",
        "Geileis",
        "Grainne",
        "Laoise",
        "Liadan",
        "Liamhain",
        "Liobhan",
        "Luiseach",
        "Malamhin",
        "Meadhbh",
        "Mealla",
        "Mor",
        "Morag",
        "Mordag",
        "Muireall",
        "Muireann",
        "Muirin",
        "Muirne",
        "Neacht",
        "Neasa",
        "Niamh",
        "Orlaith",
        "Osnait",
        "Riona",
        "Roinseach",
        "Roisin",
        "Ros",
        "Saraid",
        "Scoth",
        "Searc",
        "Sidheag",
        "Siomha",
        "Slainte",
        "Sorcha",
        "Treasa",
        "Tuathla",
        "Una"
    )
    private val maleNames = setOf(
        "Ailill",
        "Aodh",
        "Artagan",
        "Artair",
        "Bardan",
        "Bearach",
        "Bran",
        "Brion",
        "Brocc",
        "Brogan",
        "Camran",
        "Cassair",
        "Cathal",
        "Cian",
        "Cillian",
        "Conall",
        "Conan",
        "Conn",
        "Corc",
        "Cormac",
        "Curnan",
        "Dealglan",
        "Donnan",
        "Dubhagan",
        "Dughall",
        "Finnean",
        "Fionn",
        "Flann",
        "Gordan",
        "Gormal",
        "Lachlann",
        "Lasair",
        "Lonan",
        "Maon",
        "Mochta",
        "Morann",
        "Muireach",
        "Niall",
        "Ogan",
        "Onchu",
        "Orthanach",
        "Riordan",
        "Ronan",
        "Ross",
        "Ruarc",
        "Scannlan",
        "Seanan",
        "Sionn",
        "Taran",
        "Torcan"
    )
}