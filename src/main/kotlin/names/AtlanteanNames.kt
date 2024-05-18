package names

import DiceRoller
import kotlin.random.Random
import kotlin.random.nextInt

object AtlanteanNames {
    fun generateName(isFemale: Boolean = false): String = if (isFemale) {
        personalNamesFemale.random().random()
    } else {
        personalNamesMale.random().random()
    }.let {
        "$it ${clanNames.random()}"
    }
    private val personalNamesFemale = setOf(
        setOf(
            "Agape",
            "Agathe",
            "Alexandra",
            "Ambrosia",
            "Aphrodisia",
            "Apllonia",
            "Aristomache",
            "Aspasia",
            "Demostrate",
            "Elpis",
            "Eudokia",
            "Eudoxia",
            "Eulalia",
            "Eumelia",
            "Euphemia",
            "Euphrasia",
            "Euthymia",
            "Eutropia",
            "Galene",
            "Helene"
        ),
        setOf(
            "Hypatia",
            "Kallisto",
            "Kallistrate",
            "Kleio",
            "Kleopatra",
            "Korinna",
            "Lysandra",
            "Lysistrate",
            "Pelagia",
            "Phile",
            "Phoibe",
            "Photine",
            "Ptolemais",
            "Sophia",
            "Sostrate",
            "Timo",
            "Tryphosa",
            "Tycho",
            "Xanthe",
            "Xenia"
        )
    )
    private val personalNamesMale = setOf(
        setOf(
            "Agapios",
            "Agathon",
            "Akakios",
            "Alexandros",
            "Alexios",
            "Anakletos",
            "Anatolios",
            "Androkles",
            "Aniketos",
            "Apollonios",
            "Archelaos",
            "Archimedes",
            "Argyros",
            "Aristeides",
            "Aristodemos",
            "Aristokles",
            "Ariston",
            "Aristophanes",
            "Arsenios"
        ),
        setOf(
            "Athanasios",
            "Bion",
            "Demosthenes",
            "Epiketos",
            "Eupemios",
            "Euripides",
            "Euthymios",
            "Eutropios",
            "Galenos",
            "Gennadios",
            "Heliodoros",
            "Herodotos",
            "Heron",
            "Homeros",
            "Hyginos",
            "Hypatos",
            "Iason",
            "Kallikrates",
            "Kleisthenes",
            "Kleon"
        ),
        setOf(
            "Lysandros",
            "Paramonos",
            "Pelagios",
            "Phaidros",
            "Philon",
            "Phoibos",
            "Photios",
            "Platon",
            "Praxietles",
            "Ptolemaios",
            "Solon",
            "Sophokles",
            "Sophos",
            "Sosigenes",
            "Straton",
            "Themistokles",
            "Theron",
            "Timon",
            "Tychon",
            "Zephyros"
        )
    )
    private val clanNames = setOf(
        "Amphitrite",
        "Eurybia",
        "Glaukos",
        "Kymopoleia",
        "Nereos",
        "Okeanos",
        "Phorkys",
        "Pontos",
        "Poseidon",
        "Protos",
        "Thalassa",
        "Triton"
    )
}