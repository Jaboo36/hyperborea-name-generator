package names

object RomanNames {

    private fun getFemaleFirstName() = femaleNames.random()

    private fun getMaleFirstName() = maleNames.random()

    private fun getFemaleLastName() = femaleFamilyNames.random()

    private fun getMaleLastName() = maleFamilyNames.random()

    private fun getMaleNickname() = nicknames.random().first

    private fun getFemaleNickname() = nicknames.random().let { it.second ?: it.first }

    private fun getFemaleFullName() = "${getFemaleFirstName()} ${getFemaleLastName()} ${getFemaleNickname()}"

    private fun getMaleFullName() = "${getMaleFirstName()} ${getMaleLastName()} ${getMaleNickname()}"

    fun generateName(isFemale: Boolean = false) = if (isFemale) getFemaleFullName() else getMaleFullName()

    private val femaleNames = setOf(
        "Appia",
        "Aula",
        "Decima",
        "Fausta",
        "Gaia",
        "Gnaea",
        "Hosta",
        "Lucia",
        "Mania",
        "Marcia",
        "Mettia",
        "Nona",
        "Numeria",
        "Octavia",
        "Paulla",
        "Procula",
        "Publia",
        "Quinta",
        "Septima",
        "Servia",
        "Statia",
        "Tiberia",
        "Tulla",
        "Vibia",
        "Vopisca"
    )

    private val maleNames = setOf(
        "Appius",
        "Aulus",
        "Decimus",
        "Faustus",
        "Gaius",
        "Gnaeus",
        "Hostus",
        "Lucius",
        "Manius",
        "Marcus",
        "Mettius",
        "Nonus",
        "Numerius",
        "Octavius",
        "Paullus",
        "Proculus",
        "Publius",
        "Quintus",
        "Septimus",
        "Servius",
        "Statius",
        "Tiberius",
        "Tullus",
        "Vibius",
        "Vopiscus"
    )

    private val femaleFamilyNames = setOf(
        "Acilia",
        "Aemilia",
        "Calpurnia",
        "Claudia",
        "Didia",
        "Domitia",
        "Equitia",
        "Fabia",
        "Flavia",
        "Gabinia",
        "Geminia",
        "Horatia",
        "Hortensia",
        "Iulia",
        "Licinia",
        "Maria",
        "Numicia",
        "Ovidia",
        "Petronia",
        "Pontia",
        "Rubellia",
        "Sextia",
        "Titinia",
        "Ulpia",
        "Valeria"
    )

    private val maleFamilyNames = setOf(
        "Acilius",
        "Aemilius",
        "Calpurnius",
        "Claudius",
        "Didius",
        "Domitius",
        "Equitius",
        "Fabius",
        "Flavius",
        "Gabinius",
        "Geminius",
        "Horatius",
        "Hortensius",
        "Iulius",
        "Licinius",
        "Marius",
        "Numicius",
        "Ovidius",
        "Petronius",
        "Pontius",
        "Rubellius",
        "Sextius",
        "Titinius",
        "Ulpius",
        "Valerius"
    )

    private val nicknames = setOf(
        "Aculeo" to null,
        "Agricola" to null,
        "Albinus" to "Albina",
        "Albus" to "Alba",
        "Aquilinus" to "Aquilina",
        "Arvina" to null,
        "Asina" to null,
        "Atellus" to "Atella",
        "Bassus" to "Bassa",
        "Bestia" to null,
        "Bibulus" to "Bibula",
        "Brutus" to "Bruta",
        "Bubulcus" to "Bubulca",
        "Bucco" to null,
        "Buteo" to null,
        "Caepio" to null,
        "Calidus" to "Calida",
        "Calvus" to "Calva",
        "Caninus" to "Canina",
        "Canus" to "Cana",
        "Celsus" to "Celsa",
        "Corvinus" to "Corvina",
        "Crassus" to "Crassa",
        "Crispus" to "Crispa",
        "Figulus" to "Figula",
        "Flavus" to "Flava",
        "Fullo" to null,
        "Gemellus" to "Gemella",
        "Helva" to null,
        "Laterensis" to null,
        "Longus" to "Longa",
        "Lupus" to "Lupa",
        "Lurco" to null,
        "Macer" to "Macra",
        "Mergus" to "Merga",
        "Mus" to null,
        "Naso" to null,
        "Natta" to null,
        "Niger" to "Nigra",
        "Pavo" to null,
        "Pictor" to "Pictrix",
        "Pulcher" to "Pulchra",
        "Purpureo" to null,
        "Quadratus" to "Quadrata",
        "Rufus" to "Rufa",
        "Salinator" to "Salinatrix",
        "Taurus" to "Taura",
        "Varus" to "Vara",
        "Verres" to null,
        "Vitulus" to "Vitula"
    )
}