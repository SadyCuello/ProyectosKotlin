fun main() {
    for (i in 1..10) {
        val birthday = getBirthday()
        val fortune = getFortuneCookie(birthday)
        println("Tu fortuna es: $fortune")
        if (fortune == "¡Tómatelo con calma y disfruta de la vida!") break
    }
}

fun getBirthday(): Int {
    print("Ingrese su fecha de nacimiento: ")
    return readLine()?.toIntOrNull() ?: 1
}

fun getFortuneCookie(birthday: Int): String {
    val fortunes = listOf(
        "¡Tendrás un gran día!",
        "Las cosas te irán bien hoy.",
        "Disfruta de un maravilloso día de éxito.",
        "Sé humilde y todo saldrá bien.",
        "Hoy es un buen día para ejercer la moderación.",
        "¡Tómatelo con calma y disfruta de la vida!",
        "Atesora a tus amigos porque son tu mayor fortuna."
    )

    return when {
        birthday == 28 || birthday == 31 -> "¡Tendrás un gran día!"
        birthday in 1..7 -> "Las cosas te irán bien hoy."
        else -> fortunes[birthday % fortunes.size]
    }
}