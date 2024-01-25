package names

import DiceRoller

class AngloSaxonNames {

    fun generateName(isFemale: Boolean = false): String = DiceRoller.rollD4().let {
        if (isFemale) personalNamesFemale.random().random()
        else personalNamesMale.random().random()
    }
    private val personalNamesFemale = setOf(
        setOf(
            "Aelfhild",
            "Aelfthryth",
            "Bealdthryth",
            "Beohtric",
            "Beohtburg",
            "Beorhtfrith",
            "Eadflaed",
            "Eadfrith",
            "Eadhild",
            "Ealdhild"
        ),
        setOf(
            "Ealdthryth",
            "Godbeald",
            "Godric",
            "Godthryth",
            "Gunnric",
            "Gunnsige",
            "Gunnthryth",
            "Gunnwig",
            "Hildgifu",
            "Leofor"
        ),
        setOf(
            "Leofweald",
            "Mildfrith",
            "Osgifu",
            "Osthryth",
            "Saebeorht",
            "Saesige",
            "Saeweald",
            "Sigefrith",
            "Sigegifu",
            "Sigehild"
        ),
        setOf(
            "Sigeweald",
            "Thurgifu",
            "Thurhild",
            "Wigburg",
            "Wigflaed",
            "Wigweald",
            "Winewaru",
            "Winewig",
            "Wulfhild",
            "Wlfmaer"
        )
    )

    private val personalNamesMale = setOf(
        setOf(
            "Aelfgeat",
            "Aelfhard",
            "Bealdgeat",
            "Bealdheard",
            "Cuthbeald",
            "Cuthmund",
            "Cuthweard",
            "Deorbeald",
            "Deorgar",
            "Deornoth"
        ),
        setOf(
            "Deorric",
            "Deorweard",
            "Eadbeorht",
            "Eadstan",
            "Ealdbeald",
            "Ealdmund",
            "Ealdstan",
            "Godmaer",
            "Godraed",
            "Heregar"
        ),
        setOf(
            "Herenoth",
            "Leofheard",
            "Osweald",
            "Oswulf",
            "Saemaer",
            "Saeweald",
            "Sigegeat",
            "Thurhere",
            "Thurmund",
            "Thurnoth"
        ),
        setOf(
            "Thursige",
            "Wigweard",
            "Winebeald",
            "Wineraed",
            "Wulfbeald",
            "Wulfheard",
            "Wulfnoth",
            "Wulfweard",
            "Wulfwig",
            "Wulfwine"
        )
    )
}