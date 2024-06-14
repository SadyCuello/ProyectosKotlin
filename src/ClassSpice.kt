class SimpleSpice {
    var name: String = "curry"
    var spiciness: String = "mild"

    val heat: Int
        get() {
            return when (spiciness) {
                "mild" -> 5
                else -> 0
            }
        }
}

fun main() {
    val spice = SimpleSpice()
    println("Name: ${spice.name}")
    println("Heat: ${spice.heat}")
}
