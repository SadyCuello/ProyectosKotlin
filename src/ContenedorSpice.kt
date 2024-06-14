
data class SpiceContainer(val spice: Spice) {
    val label: String
        get() = spice.name
}

fun main() {

    val curry = Spice("curry", "mild")
    val pepper = Spice("pepper", "medium")
    val cayenne = Spice("cayenne", "spicy")

    val curryContainer = SpiceContainer(curry)
    val pepperContainer = SpiceContainer(pepper)
    val cayenneContainer = SpiceContainer(cayenne)

    println("Etiqueta del contenedor de especias: ${curryContainer.label}")
    println("Etiqueta del contenedor de especias: ${pepperContainer.label}")
    println("Etiqueta del contenedor de especias: ${cayenneContainer.label}")
}
