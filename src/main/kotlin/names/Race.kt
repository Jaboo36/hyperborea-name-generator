package names

enum class Race(val raceName: String) : NameGenerator {
    COMMON("Common") {
        override fun generateName(gender: Boolean?): String = gender
                ?.let { CommonNames.generateFullName(gender) }
                ?: CommonNames.generateFullName()

    },
    AMAZON("Amazon") {
        override fun generateName(gender: Boolean?): String = gender
            ?.let { AmazonNames.generateFullName(gender) }
            ?: AmazonNames.generateFullName()
    },
    ANGLO_SAXON("Anglo-Saxon") {
        override fun generateName(gender: Boolean?): String = gender
            ?.let { AngloSaxonNames.generateName(gender) }
            ?: AngloSaxonNames.generateName()
    },
    ATLATEAN("Atlatean") {
        override fun generateName(gender: Boolean?): String = gender
            ?.let { AtlanteanNames.generateName(gender) }
            ?: AtlanteanNames.generateName()
    },
    CARO_FRANK("Carolingian Frankish") {
        override fun generateName(gender: Boolean?): String = gender
            ?.let { CarolingianFrankishNames.generateName(gender) }
            ?: CarolingianFrankishNames.generateName()
    },
    ESQUIMAUX("Esquimaux") {
        override fun generateName(gender: Boolean?): String = EsquimauxNames.generateName()
    },
    ESQ_IXIAN("Esquimaux-Ixian") {
        override fun generateName(gender: Boolean?): String = EsquimauxIxianNames.generateName()
    },
    GREEK("Greek") {
        override fun generateName(gender: Boolean?): String = gender
        ?.let { GreekNames.generateName(gender) }
        ?: GreekNames.generateName()
    },
    HYPERBOREAN("Hyperborean") {
        override fun generateName(gender: Boolean?): String = gender
            ?.let { HyperboreanNames.generateName(gender) }
            ?: HyperboreanNames.generateName()
    },
    IXIAN("Ixian") {
        override fun generateName(gender: Boolean?): String = gender
            ?.let { IxianNames.generateName(gender) }
            ?: IxianNames.generateName()
    },
    KELTIC("Keltic") {
        override fun generateName(gender: Boolean?): String = gender
            ?.let { KelticNames.generateName(gender) }
            ?: KelticNames.generateName()
    },
    KIMMERIAN("Kimmerian") {
        override fun generateName(gender: Boolean?): String = gender
            ?.let { KimmerianNames.generateName(gender) }
            ?: KimmerianNames.generateName()
    },
    KRIMMEAN("Krimmean") {
        override fun generateName(gender: Boolean?): String = gender
            ?.let { KimmerianNames.generateKrimmeanName(gender) }
            ?: KimmerianNames.generateKrimmeanName()
    },
    LAPP("Lapp") {
        override fun generateName(gender: Boolean?): String {
            TODO("Not yet implemented")
        }
    },
    LEMURIAN("Lemurian") {
        override fun generateName(gender: Boolean?): String {
            TODO("Not yet implemented")
        }
    },
    MOORISH("Moorish") {
        override fun generateName(gender: Boolean?): String {
            TODO("Not yet implemented")
        }
    },
    MU("Mu") {
        override fun generateName(gender: Boolean?): String {
            TODO("Not yet implemented")
        }
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