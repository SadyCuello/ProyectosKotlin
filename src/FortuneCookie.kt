fun main() {
    for (i in 1..10) {
        val fortune = getFortuneCookie()
        println("Tu fortuna es: $fortune")
        if (fortune == "¡Tómatelo con calma y disfruta de la vida!") break
    }
}

fun getFortuneCookie(): String {
    val fortunes = listOf(
        "¡Tendrás un gran día!",
        "Las cosas te irán bien hoy.",
        "Disfruta de un maravilloso día de éxito.",
        "Sé humilde y todo saldrá bien.",
        "Hoy es un buen día para ejercer la moderación.",
        "¡Tómatelo con calma y disfruta de la vida!",
        "Atesora a tus amigos porque son tu mayor fortuna."
    )

    print("Ingrese su fecha de nacimiento: ")
    val birthday = readLine()?.toIntOrNull() ?: 1

    val index = birthday % fortunes.size
    return fortunes[index]
}