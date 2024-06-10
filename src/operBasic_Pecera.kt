class OperBasic_Pecera {
    val pecesIniciales = 2
    val críasPrimeraVez = 71
    val críasSegundaVez = 233
    val pecesTragados = 13
    val pecesPorAcuario = 30


    fun calcularPecesRestantes(): Int {
        val reproduccionPrimeraVez = pecesIniciales * críasPrimeraVez
        val reproduccionSegundaVez = reproduccionPrimeraVez + críasSegundaVez
        val pecesRestantes = reproduccionSegundaVez - pecesTragados
        val acuariosNecesarios = pecesRestantes / pecesPorAcuario
        return acuariosNecesarios + 1
    }
}

fun main() {
    val pecera = OperBasic_Pecera()
    val pecesRestantes = pecera.calcularPecesRestantes()
    println("Peces restantes: $pecesRestantes")
}
