package names

class IxianNames {
    fun generateName(isFemale: Boolean = false): String = if (isFemale) {
        println("Remember to add 'gune' before patronymic for wife, and 'thugater' for daughter")
        "${femalePersonalNames.random().random()} ${malePersonalNames.random()}"
    } else {
        "${malePersonalNames.random()} ${malePersonalNames.random()}"
    }
    private val femalePersonalNames = setOf(
        setOf(
            "Alda",
            "Ama",
            "Amage",
            "Arite",
            "Asenath",
            "Iset",
            "Kama",
            "Karos"
        ),
        setOf(
            "Leimeie",
            "Mada",
            "Maiosara",
            "Nefertiti",
            "Neferu",
            "Nekebet",
            "Nena"
        ),
        setOf(
            "Nodjime",
            "Nofret",
            "Rinnan",
            "Satani",
            "Senbet",
            "Saruke",
            "Storane",
            "Tamura"
        ),
        setOf(
            "Tem",
            "Tentopet",
            "Tentheta",
            "Tentsai",
            "Tirgatao",
            "Tiye",
            "Uiay",
            "Usekhamehi"
        )
    )
    private val malePersonalNames = setOf(
        "Abragos",
        "Akasas",
        "Andranakos",
        "Ardaros",
        "Asanos",
        "Aspakos",
        "Aspamithares",
        "Aurazakos",
        "Azos",
        "Aziagos",
        "Badagos",
        "Baxagos",
        "Bistes",
        "Borakos",
        "Chodainos",
        "Chodekios",
        "Gadikios",
        "Gaos",
        "Goson",
        "Iazadagos",
        "Iodas",
        "Irganos",
        "Kainaxarthos",
        "Karaxstos",
        "Karsas",
        "Katokas",
        "Kopharnos",
        "Kossas",
        "Madakos",
        "Mastas",
        "Medosaccos",
        "Methakos",
        "Mordos",
        "Nabazos",
        "Olgasos",
        "Ourgios",
        "Oustanos",
        "Pagos",
        "Perakos",
        "Pharnagos",
        "Phoros",
        "Rassogos",
        "Saraxazos",
        "Siranos",
        "Spakos",
        "Spithames",
        "Sturanos",
        "Xarthanos",
        "Xobas",
        "Zabandos"
    )
}