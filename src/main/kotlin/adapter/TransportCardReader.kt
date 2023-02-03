package adapter

class TransportCardReader:TransportCard {
    override fun readTransportCard(cardName: String) {
        println("only support bank card type")
    }
}