fun main() {

    val trout = "trucha"
    val haddock = "mero"
    val snapper = "camarron"


    val likesTrout = true
    val likesHaddock = false
    val likesSnapper = true

    println("¿Te gusta comer $trout? ${if (likesTrout) "Sí" else "No"}")
    println("¿Te gusta comer $haddock? ${if (likesHaddock) "Sí" else "No"}")
    println("¿Te gusta comer $snapper? ${if (likesSnapper) "Sí" else "No"}")

        val fishName = ""

        when {
            fishName.length == 0 -> {
                println("Error: El nombre del pez no puede estar vacío.")
            }
            fishName.length in 3..12 -> {
                println("Buen nombre de pez.")
            }
            else -> {
                println("OK nombre del pez.")
            }
        }
    }
