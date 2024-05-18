package names

import DiceRoller

object EsquimauxIxianNames {
    fun generateName(): String = if (DiceRoller.rollD2() == 1) EsquimauxNames.names.random().first
    else EsquimauxNames.names.random().second
}