import kotlin.math.absoluteValue

// Enumeración de direcciones
enum class Direction {
    NORTH, SOUTH, EAST, WEST, START, END
}

// Clase Location para rastrear la ubicación del jugador en un mapa 4x4
class Location(val width: Int, val height: Int) {
    var x = 0
    var y = 0

    val map = Array(width) { arrayOfNulls<String>(height) }

    init {
        map[0][0] = "You are at the starting point."
        map[0][1] = "You see a forest to the north."
        map[0][2] = "A river flows from the east."
        map[0][3] = "You reach the northern edge of the map."
        map[1][0] = "A small village is here."
        map[1][1] = "You find an abandoned house."
        map[1][2] = "There is a bridge to the south."
        map[1][3] = "You see a mountain in the distance."
        map[2][0] = "You arrive at a crossroads."
        map[2][1] = "A farm is located here."
        map[2][2] = "You find a hidden cave."
        map[2][3] = "You reach the eastern edge of the map."
        map[3][0] = "You are at the southern edge of the map."
        map[3][1] = "You see a large tree."
        map[3][2] = "A narrow path leads west."
        map[3][3] = "You find a treasure chest."
    }

    fun updateLocation(direction: Direction) {
        when (direction) {
            Direction.NORTH -> if (y > 0) y -= 1
            Direction.SOUTH -> if (y < height - 1) y += 1
            Direction.EAST -> if (x < width - 1) x += 1
            Direction.WEST -> if (x > 0) x -= 1
            else -> {
                // Do nothing
            }
        }
    }

    fun getLocationDescription(): String {
        return map[x][y] ?: "You are at an unknown location."
    }
}

// Clase Game
class Game {
    var path = mutableListOf(Direction.START)
    val location = Location(4, 4)

    // Lambdas para agregar direcciones a la ruta
    val north = {
        path.add(Direction.NORTH)
        location.updateLocation(Direction.NORTH)
        println(location.getLocationDescription())
    }
    val south = {
        path.add(Direction.SOUTH)
        location.updateLocation(Direction.SOUTH)
        println(location.getLocationDescription())
    }
    val east = {
        path.add(Direction.EAST)
        location.updateLocation(Direction.EAST)
        println(location.getLocationDescription())
    }
    val west = {
        path.add(Direction.WEST)
        location.updateLocation(Direction.WEST)
        println(location.getLocationDescription())
    }

    // Lambda para finalizar el juego
    val end = {
        path.add(Direction.END)
        println("Game Over")
        println("Path: $path")
        path.clear()
        false
    }

    // Función para mover en una dirección específica
    fun move(where: () -> Unit) {
        where()
    }

    // Función para interpretar el movimiento
    fun makeMove(direction: String?) {
        when (direction) {
            "n" -> move(north)
            "s" -> move(south)
            "e" -> move(east)
            "w" -> move(west)
            else -> move(end)
        }
    }
}

// Función principal
fun main() {
    val game = Game()
    while (true) {
        print("Enter a direction: n/s/e/w: ")
        val input = readLine()
        game.makeMove(input)
    }
}

