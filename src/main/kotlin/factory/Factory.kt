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

        if (shapeType.equals("CIRCLE", true)) return Circle()
        if (shapeType.equals("RECTANGLE", true)) return Rectangle()

        return null
    }
}
fun main(args: Array<String>) {

    val shapeFactory = Factory()
    shapeFactory.getShape("CIRCLE")?.draw()
    shapeFactory.getShape("RECTANGLE")?.draw()

}