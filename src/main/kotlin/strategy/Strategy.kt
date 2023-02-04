package strategy

class Printer{
    var printingStrategy: PrintingStrategy? = null
    fun print(text: String){
       printingStrategy?.execute(text)
    }
}

interface PrintingStrategy{
    fun execute(text: String)
}

class SimplePrintingStrategy: PrintingStrategy{
    override fun execute(text: String) {
        println(text)
    }
}

class PrettyPrintingStrategy: PrintingStrategy {
    override fun execute(text: String) {
        println("\uD83D\uDC69\uD83C\uDFFB\u200D\uD83D\uDCBB $text \uD83D\uDC69\uD83C\uDFFB\u200D\uD83D\uDCBB")
    }
}

fun main(){
    val printer = Printer()

    for (i in 0 .. 10){
        if (i % 2 == 0){
            printer.printingStrategy = SimplePrintingStrategy()
        } else {
            printer.printingStrategy = PrettyPrintingStrategy()
        }
        printer.print(i.toString())
    }
}