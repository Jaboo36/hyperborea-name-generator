package names

enum class Race(val raceName: String) : NameGenerator {
    COMMON("Common") {
        override fun generateName(gender: Boolean?): String = CommonNames.generateFullName(gender ?: false)

    },
    AMAZON("Amazon") {
        override fun generateName(gender: Boolean?): String = AmazonNames.generateFullName(gender ?: false)
    },
    ANGLO_SAXON("Anglo-Saxon") {
        override fun generateName(gender: Boolean?): String = AngloSaxonNames.generateName(gender ?: false)
    },
    ATLATEAN("Atlatean") {
        override fun generateName(gender: Boolean?): String = AtlanteanNames.generateName(gender ?: false)
    },
    CARO_FRANK("Carolingian Frankish") {
        override fun generateName(gender: Boolean?): String = CarolingianFrankishNames.generateName(gender ?: false)
    },
    ESQUIMAUX("Esquimaux") {
        override fun generateName(gender: Boolean?): String = EsquimauxNames.generateName()
    },
    ESQ_IXIAN("Esquimaux-Ixian") {
        override fun generateName(gender: Boolean?): String = EsquimauxIxianNames.generateName()
    },
    GREEK("Greek") {
        override fun generateName(gender: Boolean?): String = GreekNames.generateName(gender ?: false)
    },
    HYPERBOREAN("Hyperborean") {
        override fun generateName(gender: Boolean?): String = HyperboreanNames.generateName(gender ?: false)
    },
    IXIAN("Ixian") {
        override fun generateName(gender: Boolean?): String = IxianNames.generateName(gender ?: false)
    },
    KELTIC("Keltic") {
        override fun generateName(gender: Boolean?): String = KelticNames.generateName(gender ?: false)
    },
    KIMMERIAN("Kimmerian") {
        override fun generateName(gender: Boolean?): String = KimmerianNames.generateName(gender ?: false)
    },
    KRIMMEAN("Krimmean") {
        override fun generateName(gender: Boolean?): String = KimmerianNames.generateKrimmeanName(gender ?: false)
    },
    LAPP("Lapp") {
        override fun generateName(gender: Boolean?): String = LappNames.generateName(gender ?: false)
    },
    LEMURIAN("Lemurian") {
        override fun generateName(gender: Boolean?): String = LemurianNames.generateName(gender ?: false)
    },
    MOORISH("Moorish") {
        override fun generateName(gender: Boolean?): String = MoorishNames.generateName(gender ?: false)
    },
    MU("Mu") {
        override fun generateName(gender: Boolean?): String = MuNames.generateName(gender ?: false)
    },
    PICTISH("Pictish") {
        override fun generateName(gender: Boolean?): String {
            TODO("Not yet implemented")
        }
    },
    ROMAN("Roman") {
        override fun generateName(gender: Boolean?): String {
            TODO("Not yet implemented")
        }
    },
    TLINGIT("Tlingit") {
        override fun generateName(gender: Boolean?): String {
            TODO("Not yet implemented")
        }
    },
    VIKING("Viking") {
        override fun generateName(gender: Boolean?): String {
            TODO("Not yet implemented")
        }
    },
    Yakut("Yakut") {
        override fun generateName(gender: Boolean?): String {
            TODO("Not yet implemented")
        }
    }
}