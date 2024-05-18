package names

object KimmerianNames {

    fun generateName(isFemale: Boolean = false): String =
        if (isFemale) generateFemaleName()
        else generateMaleName()

    fun generateKrimmeanName(isFemale: Boolean = false) =
        if (isFemale) generateFemaleKrimmeanName()
        else generateMaleKrimmeanName()

    private fun generateFemaleName(): String = femaleNames.random().random()

    private fun generateMaleName(): String = maleNames.random().random()

    private fun generateFemaleKrimmeanName(): String = femaleKrimmeanNames.random()

    private fun generateMaleKrimmeanName(): String = maleKrimmeanNames.random()
    private val femaleNames = setOf(
        setOf(
            "Agape",
            "Agathe",
            "Alexandra",
            "Aristomache",
            "Aspasia",
            "Athanasia",
            "Chrysanthe",
            "Demostrate",
            "Elpis",
            "Euanthe",
            "Eudokia",
            "Eudoxia",
            "Eulalia",
            "Eunike",
            "Euphemia",
            "Euphrasia",
            "Euthalia",
            "Euthymia",
            "Eutropia",
            "Galene"
        ),
        setOf(
            "Helene",
            "Hypatia",
            "Kallisto",
            "Kallistrate",
            "Kleopatra",
            "Korinna",
            "Lysandra",
            "Lysistrate",
            "Phoibe",
            "Photine",
            "Ptolemais",
            "Sappho",
            "Sophia",
            "Sostrate",
            "Syntyche",
            "Timo",
            "Tryphosa",
            "Xenia",
            "Xeno",
            "Zosime"
        )
    )
    private val maleNames = setOf(
        setOf(
            "Agathon",
            "Alexadros",
            "Alexios",
            "Anakletos",
            "Adronikos",
            "Antigonos",
            "Archippos",
            "Aristeides",
            "Aristokles",
            "Ariston",
            "Drakon",
            "Eukleides",
            "Euphemios",
            "Galenos",
            "Heliodoros",
            "Herakleides",
            "Herodotos",
            "Heron",
            "Hippolytos",
            "Iason"
        ),
        setOf(
            "Kleon",
            "Krimmos",
            "Leonidas",
            "Lykos",
            "Lysandros",
            "Nikandros",
            "Nikephoros",
            "Nikomedes",
            "Pantheras",
            "Paramonos",
            "Photios",
            "Platon",
            "Pyrrhos",
            "Sokrates",
            "Sophokles",
            "Straton",
            "Theron",
            "Tychon",
            "Xenokrates",
            "Zoktikos"
        )
    )
    private val femaleKrimmeanNames = setOf(
        "Alda",
        "Amachis",
        "Aritucu",
        "Dentusucu",
        "Dizasokos",
        "Epleimeie",
        "Eptesuchis",
        "Kersesuchis",
        "Madokos",
        "Mokasokos",
        "Nihmukos",
        "Rhaskusucu",
        "Sarakos",
        "Saruke",
        "Storane",
        "Surasokos",
        "Tamuros",
        "Tarma",
        "Tarusucu",
        "Tirgatos"
    )
    private val maleKrimmeanNames = setOf(
        "Bryzos",
        "Byzes",
        "Dentupes",
        "Diaskenthos",
        "Diazenis",
        "Dizapes",
        "Dizazelmis",
        "Drenis",
        "Ezbenis",
        "Gaidres",
        "Kerses",
        "Mukos",
        "Mukakenthos",
        "Pytros",
        "Rhaskos",
        "Rhesos",
        "Skaris",
        "Tarutinos",
        "Ziles",
        "Zipyros"
    )
}