package names

object PictishNames {
    fun generateName(isFemale: Boolean = false): String = if (isFemale) generateFemaleName() else generateMaleName()

    private fun generateFemaleName() = femaleNames.random()

    private fun generateMaleName() = maleNames
        .random()
        .let { "$it nepos ${generateUncleName()}" }

    private fun generateUncleName(): String = maleNames
        .random()
        .let {
            val suffix = getSuffix(it)
            it.dropLast(suffix.length) + suffix
        }

    private fun getSuffix(name: String): String = maleSuffix
        .asSequence()
        .firstOrNull { name.endsWith(it.key) }
        ?.value
        ?: ""



    private val femaleNames = setOf(
        "Barita",
        "Bodicca",
        "Cartimandua",
        "Cobblaith",
        "Cunoarda",
        "Cunovinda",
        "Drusstic",
        "Elpia",
        "Eithni",
        "Eurgeinn",
        "Huctia",
        "Liggagh",
        "Luann",
        "Luncetta",
        "Nectudagh",
        "Scathagh",
        "Tea",
        "Ventissa",
        "Verctissa",
        "Verica"
    )

    private val maleNames = setOf(
        "Argentocoxos",
        "Arviragos",
        "Bodiccios",
        "Brigomaglos",
        "Cacumattos",
        "Calgacos",
        "Caratacos",
        "Catavignos",
        "Ceanatis",
        "Cingetorix",
        "Cintusmos",
        "Cogidubnos",
        "Commios",
        "Crotos",
        "Cunittos",
        "Cunobarros",
        "Cunobelinos",
        "Cunopectos",
        "Cunovindos",
        "Dubnovellaunos",
        "Enestinos",
        "Ivomagos",
        "Litugenos",
        "Lugotorix",
        "Mandubracios",
        "Matugenos",
        "Morirex",
        "Motios",
        "Nectovelios",
        "Rianorix",
        "Saccios",
        "Segovax",
        "Senorix",
        "Setibogios",
        "Tancorix",
        "Taximagulos",
        "Togodumnos",
        "Uepogenos",
        "Venutios",
        "Vindex"
    )

    private val maleSuffix = mapOf(
        "ex" to "egis",
        "ix" to "igis",
        "os" to "i"
    )
}