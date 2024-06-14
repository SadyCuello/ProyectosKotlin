fun main() {
    println(whatShouldIDoToday("happy"))
    println(whatShouldIDoToday("sad"))
    println(whatShouldIDoToday("happy", "rainy"))
    println(whatShouldIDoToday("sad", "rainy", 10))
    println(whatShouldIDoToday("happy", "cloudy", 15))
    println(whatShouldIDoToday("bored", "windy", 5))
}

fun whatShouldIDoToday(mood: String, weather: String = "sunny", temperature: Int = 24): String {
    return when {
        mood == "happy" && weather == "sunny" -> "Go for a walk"
        mood == "sad" && weather == "rainy" && temperature < 10 -> "Stay in bed and sleep"
        mood == "bored" && weather == "windy" -> "Fly a kite"
        weather == "rainy" -> "Stay home and watch a movie"
        temperature > 30 -> "Go to the beach"
        else -> "Stay home and read."
    }
}