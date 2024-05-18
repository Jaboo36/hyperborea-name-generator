package names

object HyperboreanNames {

    fun generateName(isFemale: Boolean = false): String = if (isFemale) {
        "$FEMALE_PREFIX${generatePersonalName()} ${generateFamilyName()}"
    } else {
        "${generatePersonalName()} ${generateFamilyName()}"
    }

    private fun generatePersonalName(): String {
        val firstElement = personalNameElements.random().random()
        val connectingVowel = connectingVowel.random()
        val lastElement = personalNameElements.random().random()

        return firstElement + connectingVowel + lastElement
    }

    private fun generateFamilyName(): String = familyNames.random().random()

    private val personalNameElements = setOf(
        setOf(
            "Dar",
            "Dor",
            "Dunn",
            "Gal",
            "Gan",
            "Gar",
            "Gol",
            "Gon",
            "Gor",
            "Gul",
            "Kal",
            "Kar",
            "Kil",
            "Kol",
            "Kon",
            "Kor",
            "Kul",
            "Kur",
            "Mal",
            "Mar"
        ),
        setOf(
            "Mir",
            "Mor",
            "Mur",
            "Plo",
            "Pol",
            "Val",
            "Van",
            "Var",
            "Vil",
            "Vir",
            "Vol",
            "Von",
            "Vor",
            "Vul",
            "Vun",
            "Vur",
            "Xal",
            "Xan",
            "Xar",
            "Xil"
        ),
        setOf(
            "Xin",
            "Xir",
            "Xol",
            "Xon",
            "Xor",
            "Xul",
            "Xun",
            "Xur",
            "Zal",
            "Zan",
            "Zar",
            "Zil",
            "Zin",
            "Zir",
            "Zol",
            "Zon",
            "Zor",
            "Zul",
            "Zun",
            "Zur"
        )
    )
    private val connectingVowel = setOf(
        "-a-",
        "-i-",
        "-o-",
        "-u-"
    )
    private val familyNames = setOf(
        setOf(
            "Druun",
            "Ghuul",
            "Graax",
            "Kloon",
            "Phaaz",
            "Ploon",
            "Qaan",
            "Rhaan"
        ),
        setOf(
            "Shoon",
            "Slaan",
            "Thoon",
            "Traal",
            "Vheez",
            "Xhoon",
            "Zhaan",
            "Zhuu"
        )
    )
    private const val FEMALE_PREFIX = "Sha-"
}