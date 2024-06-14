class Spice(val name: String, val spiciness: String = "mild") {
    val heat: Int
        get() {
            return when (spiciness) {
                "mild" -> 5
                "medium" -> 7
                "spicy" -> 10
                "very spicy" -> 15
                "extremely spicy" -> 20
                else -> 0
            }
        }

    init {
        println("Especia creada: $name con picante $spiciness y calor $heat")
    }
}
fun makeSalt(): Spice {
    return Spice("sal", "no")
}

fun main() {

    val spices = listOf(
        Spice("curry", "mild"),
        Spice("pepper", "medium"),
        Spice("cayenne", "spicy"),
        Spice("jalapeno", "very spicy"),
        Spice("habanero", "extremely spicy"),
        makeSalt()
    )

    val lessSpicySpices = spices.filter { it.heat <= 10 }

    println("Especias picantes o menos picantes:")
    for (sp in lessSpicySpices) {
        println("${sp.name} con picante ${sp.spiciness} y calor ${sp.heat}")
    }
}
