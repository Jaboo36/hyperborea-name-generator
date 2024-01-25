package names

import DiceRoller
import DiceRoller.random
import kotlin.random.nextInt

class CommonNames {
    private fun generateNumberOfNameElements(): Int = when (DiceRoller.rollD6()) {
        in 1..3 -> 1
        in 4..6 -> 2
        else -> throw IllegalArgumentException("Only values between 1 and 6 are accepted")
    }

    private fun hasSurnameSuffix(): Boolean = random.nextInt(1..4) == 1

    private fun getSurnameSuffix(): String? = if (hasSurnameSuffix()) {
        commonSurnameSuffix.random()
    } else {
        null
    }

    private fun getFemaleSuffix(): String = commonFemaleSuffix.random()

    private fun generateNamePart(): String {
        val num = generateNumberOfNameElements()
        require(num in 1..2) { "Only values between 1 and 2 are accepted" }
        val oneElement = num in 1..1
        val firstElement = commonNameElements
            .random()
            .optionallyRemoveLastChar()
        val secondElement = if (oneElement) {
            null
        } else {
            commonNameElements
                .random()
                .lowercase()
                .optionallyRemoveLastChar()
        }

        return "$firstElement${secondElement ?: ""}"
    }

    private fun String.optionallyRemoveLastChar(): String {
        return if (areLastTwoCharactersEqual(this) && DiceRoller.rollD2() == 1) {
            this.dropLast(1)
        } else {
            this
        }
    }

    fun generateFullName(female: Boolean = false): String {
        val firstName = generateNamePart().let { if (female) it + getFemaleSuffix() else it }
        val lastName = generateNamePart()
        val suffix = getSurnameSuffix()

        return "$firstName $lastName${suffix ?: ""}"
    }

    private fun areLastTwoCharactersEqual(input: String): Boolean {
        val length = input.length
        return if (length >= 2) {
            input[length - 2] == input[length - 1]
        } else {
            false
        }
    }

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