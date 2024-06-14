fun main() {

    val numeros = intArrayOf(11, 12, 13, 14, 15)

    val listaPalabras: MutableList<String> = mutableListOf()

    for (num in numeros) {
        listaPalabras.add(num.toString())
    }
    println("Lista de cadenas: $listaPalabras")
}