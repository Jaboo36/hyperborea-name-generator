package names

import DiceRoller

object MuNames {

    fun generateName(isFemale: Boolean): String {
        val married = DiceRoller.rollD2() == 1
        val name = names.random()
        return if (isFemale && married) name.generateMarriedFemaleName() else name
    }

    private fun String.generateMarriedFemaleName(): String = this + getSuffix()

    private fun String.getSuffix(): String = if (last() == 'a') "sha" else "asha"

    private val names = setOf(
        "Batu",
        "Bagada",
        "Bahareko",
        "Baijata",
        "Bailti",
        "Bisku",
        "Bora",
        "Bortegana",
        "Dangata",
        "Darbohanshati",
        "Darbu",
        "Dubano",
        "Dzogoshi",
        "Gabata",
        "Gasani",
        "Gatifan",
        "Ged-ahini",
        "Genzebo",
        "Guri",
        "Gurlu",
        "Habura",
        "Hadzi",
        "Kaibiri",
        "Kalati",
        "Kashin",
        "Kidzi",
        "Kitshaki",
        "Kiwak",
        "Kokaodi",
        "Korumi",
        "Kulugmat",
        "Kushta",
        "Lakha-ta",
        "Lambano",
        "Mangatinuh",
        "Mertematakalbano",
        "Mizgita",
        "Mogatooti",
        "Munatenorma",
        "Nagaikota",
        "Nuh-ni",
        "Okuhnti",
        "Ramun-auni",
        "Shida",
        "Sho-kaia",
        "Shuaxota",
        "Shuo",
        "Ta-mita",
        "Taehata",
        "Tashana",
        "Tin-ako",
        "Tinteganzabu",
        "Tirgata",
        "To-ra",
        "Toko-na",
        "Tshoma",
        "Tso-nakau",
        "Tukahe-da",
        "Wu-rakatobat",
        "Zilanka"
    )

}