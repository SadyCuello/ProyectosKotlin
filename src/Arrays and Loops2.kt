fun main() {

    val listaDivisible: MutableList<Int> = mutableListOf()


    for (numeros in 0..100) {
        if (numeros % 7 == 0) {
            listaDivisible.add(numeros)
        }
    }
    
    println("Números entre 0 y 100 divisibles por 7: $listaDivisible")
}