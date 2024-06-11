fun main() {

    var nullTest: Int? = null

    val result = (nullTest?.plus(1)) ?: 0

    println("El resultado es: $result")
}
