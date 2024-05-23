package names

import java.lang.reflect.Array.set

object TlingitNames {
    fun generateName(isFemale: Boolean): String = "${names.random()} ${group.random()}"
    private val group = setOf("Gooch", "Yeil")
    private val names = setOf(
        "Ch'aak",
        "Ch'aal",
        "Chaatl",
        "Ch'eet",
        "Chex'i",
        "Dis",
        "Gagaan",
        "Gayeis",
        "Gijook",
        "Gooch",
        "Goon",
        "Keet",
        "Koon",
        "K'oox",
        "L'ook",
        "S'ax",
        "S'eek",
        "Shaa",
        "Shis'gi",
        "Sit'",
        "Taan",
        "Tax'",
        "Tleilu",
        "Toos",
        "Tsisk'w",
        "Tukka",
        "Weix",
        "X'aan",
        "Xaas",
        "Xaatl",
        "Xaay",
        "X'atgu",
        "Xeitl",
        "Xik",
        "Xich'i",
        "Xoots",
        "Yaaw",
        "Yaay",
        "Yeik",
        "Yeil"
    )
}