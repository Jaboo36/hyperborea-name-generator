package names

import DiceRoller

object CommonNames {
    private fun generateNumberOfNameElements(): Int = DiceRoller.rollD2()

    private fun hasSurnameSuffix(): Boolean = DiceRoller.rollD4() == 1

    private fun getSurnameSuffix(): String? = if (hasSurnameSuffix()) commonSurnameSuffix.random() else null

    private fun getFemaleSuffix(): String = commonFemaleSuffix.random()

    private fun generateNamePart(): String {
        val numberOfElements = generateNumberOfNameElements()
        val firstElement = generateNameElement()
        val secondElement = if (numberOfElements == 1) null else generateLowercaseNameElement()
        return firstElement + (secondElement ?: "")
    }

    private fun generateNameElement() = commonNameElements
        .random()
        .optionallyRemoveLastChar()

    private fun generateLowercaseNameElement() = generateNameElement().lowercase()

    private fun String.optionallyRemoveLastChar(): String =
        if (lastTwoCharsAreEqual() && DiceRoller.rollD2() == 1) dropLast(1) else this

    fun generateFullName(female: Boolean = false): String {
        val firstName = generateNamePart().let { if (female) it + getFemaleSuffix() else it }
        val lastName = generateNamePart()
        val suffix = getSurnameSuffix()

        return "$firstName $lastName${suffix ?: ""}"
    }

    private fun String.lastTwoCharsAreEqual(): Boolean = if (length >= 2) {
        takeLast(2).let { it.length == 2 && it.first() == it.last() }
    } else false

    private val commonSurnameSuffix = setOf(
        "os",
        "tos",
        "tose"
    )

    private val commonFemaleSuffix = setOf(
        "a",
        "esta",
        "ia"
    )

    private val commonNameElements = setOf(
        "Cai",
        "Cair",
        "Conn",
        "Dai",
        "Dail",
        "Dain",
        "Dall",
        "Darr",
        "Denn",
        "Dill",
        "Dunn",
        "Fell",
        "Fenn",
        "Gann",
        "Garr",
        "Gill",
        "Goll",
        "Gunn",
        "Kai",
        "Kain",
        "Kamm",
        "Kell",
        "Koll",
        "Konn",
        "Korr",
        "Kull",
        "Marr",
        "Morr",
        "Nai",
        "Nain",
        "Nall",
        "Narr",
        "Nill",
        "Pai",
        "Parr",
        "Penn",
        "Qann",
        "Qarr",
        "Qell",
        "Qill",
        "Qull",
        "Rai",
        "Rall",
        "Ramm",
        "Rann",
        "Rell",
        "Renn",
        "Rhai",
        "Rhal",
        "Rhan",
        "Rhel",
        "Rhen",
        "Rhil",
        "Rhul",
        "Rhun",
        "Rill",
        "Rull",
        "Sai",
        "Samm",
        "Sarr",
        "Tai",
        "Tain",
        "Tair",
        "Tann",
        "Tarr",
        "Tenn",
        "Torr",
        "Tull",
        "Vai",
        "Vair",
        "Vall",
        "Vann",
        "Varr",
        "Vell",
        "Venn",
        "Vill",
        "Voll",
        "Vonn",
        "Vorr",
        "Vull",
        "Vunn",
        "Xai",
        "Xall",
        "Xann",
        "Xarr",
        "Xell",
        "Xenn",
        "Xill",
        "Xonn",
        "Xull",
        "Yann",
        "Zai",
        "Zall",
        "Zann",
        "Zarr",
        "Zell",
        "Zenn",
        "Zill",
        "Zonn",
        "Zul"
    )
}