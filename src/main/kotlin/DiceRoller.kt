import kotlin.math.ceil
import kotlin.math.roundToInt
import kotlin.random.Random
import kotlin.random.nextInt

object DiceRoller {
    fun rollD100(): Int = random.nextInt(1..100)

    fun rollD50(): Int = random.nextInt(1..50)

    fun rollD20(): Int = random.nextInt(1..20)

    fun rollD12(): Int = random.nextInt(1..12)

    fun rollD10(): Int = random.nextInt(1..10)

    fun rollD8(): Int = random.nextInt(1..8)

    fun rollD6(): Int = random.nextInt(1..6)

    fun rollD4(): Int = random.nextInt(1..4)

    fun rollD3(): Int = random.nextInt(1..3)

    fun rollD2(): Int = random.nextInt(1..2)

    val random = Random.Default
}
