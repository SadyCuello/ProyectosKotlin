fun main() {

    val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper")

    val curries = spices.filter { it.contains("curry") }.sortedBy { it.length }
    println("Curries ordenados por longitud: $curries")

    val spicesStartCEndE1 = spices.filter { it.startsWith('c') && it.endsWith('e') }
    println("Especias que comienzan con 'c' y terminan en 'e' (Método 1): $spicesStartCEndE1")


    val spicesStartCEndE2 = spices.filter { it.matches(Regex("^c.*e$")) }
    println("Especias que comienzan con 'c' y terminan en 'e' (Método 2): $spicesStartCEndE2")


    val firstThreeStartC = spices.take(3).filter { it.startsWith('c') }
    println("Primeros tres elementos que comienzan con 'c': $firstThreeStartC")
}
