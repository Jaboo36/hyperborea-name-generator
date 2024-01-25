package names

import DiceRoller

class EsquimauxIxianNames : EsquimauxNames() {
    override fun generateName(): String = if (DiceRoller.rollD2() == 1) names.random().first else names.random().second
}