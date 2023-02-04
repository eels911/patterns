package adapter

fun main(){
    val card = CardReaderImpl()
    card.read("bankCard","Visa")
    card.read("transportCard","Troika")
}

