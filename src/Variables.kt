fun main() {

    var rainbowColor = "Purpura"
    println("Color del arco iris: $rainbowColor")

    rainbowColor = "Rojo"
    println("Nuevo color del arco iris: $rainbowColor")

    val blackColor = "Plateado"
    println("Mi color favorito es: $blackColor")

    // blackColor = "Dorado"
    // println("Mi color favorito es: $blackColor")

    rainbowColor = null.toString().toString()

    var greenColor: String? = "green"
    var blueColor: String? = "blue"

    greenColor = null
    blueColor = blueColor?.let { null }

    println("rainbowColor: $rainbowColor")
    println("greenColor: $greenColor")
    println("blueColor: $blueColor")
}
