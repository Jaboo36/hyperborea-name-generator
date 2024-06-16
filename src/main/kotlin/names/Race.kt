package names

enum class Race(val raceName: String) : NameGenerator {
    COMMON("Common") {
        override fun generateName(isFemale: Boolean?): String = CommonNames.generateFullName(isFemale ?: false)

    },
    AMAZON("Amazon") {
        override fun generateName(isFemale: Boolean?): String = AmazonNames.generateName(isFemale ?: false)
    },
    ANGLO_SAXON("Anglo-Saxon") {
        override fun generateName(isFemale: Boolean?): String = AngloSaxonNames.generateName(isFemale ?: false)
    },
    ATLATEAN("Atlatean") {
        override fun generateName(isFemale: Boolean?): String = AtlanteanNames.generateName(isFemale ?: false)
    },
    CARO_FRANK("Carolingian Frankish") {
        override fun generateName(isFemale: Boolean?): String = CarolingianFrankishNames.generateName(isFemale ?: false)
    },
    ESQUIMAUX("Esquimaux") {
        override fun generateName(isFemale: Boolean?): String = EsquimauxNames.generateName()
    },
    ESQ_IXIAN("Esquimaux-Ixian") {
        override fun generateName(isFemale: Boolean?): String = EsquimauxIxianNames.generateName()
    },
    GREEK("Greek") {
        override fun generateName(isFemale: Boolean?): String = GreekNames.generateName(isFemale ?: false)
    },
    HYPERBOREAN("Hyperborean") {
        override fun generateName(isFemale: Boolean?): String = HyperboreanNames.generateName(isFemale ?: false)
    },
    IXIAN("Ixian") {
        override fun generateName(isFemale: Boolean?): String = IxianNames.generateName(isFemale ?: false)
    },
    KELTIC("Keltic") {
        override fun generateName(isFemale: Boolean?): String = KelticNames.generateName(isFemale ?: false)
    },
    KIMMERIAN("Kimmerian") {
        override fun generateName(isFemale: Boolean?): String = KimmerianNames.generateName(isFemale ?: false)
    },
    KRIMMEAN("Krimmean") {
        override fun generateName(isFemale: Boolean?): String = KimmerianNames.generateKrimmeanName(isFemale ?: false)
    },
    LAPP("Lapp") {
        override fun generateName(isFemale: Boolean?): String = LappNames.generateName(isFemale ?: false)
    },
    LEMURIAN("Lemurian") {
        override fun generateName(isFemale: Boolean?): String = LemurianNames.generateName(isFemale ?: false)
    },
    MOORISH("Moorish") {
        override fun generateName(isFemale: Boolean?): String = MoorishNames.generateName(isFemale ?: false)
    },
    MU("Mu") {
        override fun generateName(isFemale: Boolean?): String = MuNames.generateName(isFemale ?: false)
    },
    PICTISH("Pictish") {
        override fun generateName(isFemale: Boolean?): String = PictishNames.generateName(isFemale ?: false)
    },
    ROMAN("Roman") {
        override fun generateName(isFemale: Boolean?): String = RomanNames.generateName(isFemale ?: false)
    },
    TLINGIT("Tlingit") {
        override fun generateName(isFemale: Boolean?): String = TlingitNames.generateName()
    },
    VIKING("Viking") {
        override fun generateName(isFemale: Boolean?): String = VikingNames.generateName(isFemale ?: false)
    },
    Yakut("Yakut") {
        override fun generateName(isFemale: Boolean?): String = YakutNames.generateName(isFemale ?: false)
    }
}