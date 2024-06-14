import java.util.Random

fun main() {

    val rollDice1 = { Random().nextInt(12) + 1 }


    val rollDice2: (Int) -> Int = { sides ->
        Random().nextInt(sides) + 1
    }

    val rollDice3 = { sides: Int ->
        if (sides == 0) 0
        else Random().nextInt(sides) + 1
    }


    fun gamePlay(roll: (Int) -> Int) {
        val result = roll(6)
        println("Tirada de dados: $result")
    }

    println("Tirada con lambda rollDice1 (1 a 12): ${rollDice1()}")
    println("Tirada con lambda rollDice2 (6 lados): ${rollDice2(6)}")
    println("Tirada con lambda rollDice3 (0 lados): ${rollDice3(0)}")

    // Llamamos gamePlay usando rollDice2 como argumento para generar una tirada de dados
    gamePlay(rollDice2)
}

