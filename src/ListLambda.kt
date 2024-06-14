
fun List<Int>.filterDivisibleBy(condition: (Int) -> Boolean): List<Int> {
    val result = mutableListOf<Int>()
    for (item in this) {
        if (condition(item)) {
            result.add(item)
        }
    }
    return result
}
fun main() {
    val numbers = listOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)
    val divisibleBy3 = numbers.filterDivisibleBy { it % 3 == 0 }
    println(divisibleBy3)
}