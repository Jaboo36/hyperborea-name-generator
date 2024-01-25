import kotlin.math.ceil
import kotlin.math.roundToInt
import kotlin.random.Random
import kotlin.random.nextInt

object DiceRoller {
    fun rollD100(): Int = (random.nextInt(0..9) * 10 + random.nextInt(0..9)).let {
        if (it == 0) 100 else it
    }

    fun rollD50(): Int = (rollD100().toDouble() / 2.0).roundUpToInt()

    fun rollD20(): Int = random.nextInt(1..20)

    fun rollD12(): Int = random.nextInt(1..12)

    fun rollD10(): Int = random.nextInt(1..10)

    fun rollD8(): Int = random.nextInt(1..8)

    fun rollD6(): Int = random.nextInt(1..6)

    fun rollD4(): Int = random.nextInt(1..4)

    fun rollD3(): Int = (rollD6().toDouble() / 2.0).roundUpToInt()

    fun rollD2(): Int = random.nextInt(1..2)

    val random = Random.Default
}

fun Double.roundUpToInt(): Int = ceil(this).toInt()