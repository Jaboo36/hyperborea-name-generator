package names

object MoorishNames {

    fun generateName(isFemale: Boolean): String {
        val firstName = if (isFemale) femaleNames.random() else maleNames.random()
        val lastName = maleNames.random()
        val prefix = if (isFemale) prefix.first() else prefix.last()
        return "$firstName $prefix$lastName"
    }

    private val femaleNames = setOf(
        "Aisha",
        "Amena",
        "Baya",
        "Hadada",
        "Illi",
        "Kahina",
        "Kella",
        "Lella",
        "Lemta",
        "Lundja",
        "Markunda",
        "Muli",
        "Rayshabu",
        "Safiyya",
        "Sekkura",
        "Tanelhir",
        "Tanloubouh",
        "Thula",
        "Tinfsut",
        "tioueyin",
        "Tufifawt",
        "Tufent",
        "Wertenezzu",
        "Zegiga",
        "Zahara"
    )

    private val maleNames = setOf(
        "Ahmedu",
        "Amergiw",
        "Antal",
        "Asmil",
        "Azawakh",
        "Aziouel",
        "Baragsen",
        "Beddis",
        "Bekketa",
        "Brahim",
        "Dassin",
        "Ehenkouen",
        "Ehenu",
        "Idir",
        "Ilou",
        "Izil",
        "Khyar",
        "Lamine",
        "Masgaba",
        "Massena",
        "Munatas",
        "Sidi",
        "Sufian",
        "Tariq",
        "Udad",
        "Wagguten",
        "Yabdas",
        "Yuba",
        "Yugerten",
        "Ziri"
    )

    private val prefix = setOf(
        "ult-",
        "ag-"
    )

}