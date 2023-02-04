package factory
interface Shape {
    fun draw()
}
class Circle : Shape {
    override fun draw() {
        println("draw factory.Circle")
    }
}

class Rectangle : Shape {
    override fun draw() {
        println("draw factory.Rectangle")
    }
}

class Factory {
    fun getShape(shapeType: String?): Shape? {
        when (shapeType) {
            "CIRCLE" -> Circle()
            "RECTANGLE" -> Rectangle()
        }
        return null
    }
}
fun main() {

    val shapeFactory = Factory()
    shapeFactory.getShape("CIRCLE")?.draw()
    shapeFactory.getShape("RECTANGLE")?.draw()

}