
open class BaseBuildingMaterial


class Madera: BaseBuildingMaterial()

class Building<T : BaseBuildingMaterial>(val material: T, val needed: Int) {
    fun buildingDetails() {
        println("Material: ${material.javaClass.simpleName}, Necesita: $needed unidades")
    }
}

fun <T : BaseBuildingMaterial> isSmallBuilding(building: Building<T>) {
    if (building.needed < 500) {
        println("Edificio pequeño")
    } else {
        println("Edificio grande")
    }
}

fun main() {

    val building1 = Building(Madera(), 400)
    building1.buildingDetails()
    isSmallBuilding(building1)

    val building2 = Building(Madera(), 800)
    building2.buildingDetails()
    isSmallBuilding(building2)
}
