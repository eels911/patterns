package adapter

open class CardAdapter: BankCard {
    private var transportCard: TransportCard? = null

    override fun read(cardType: String, cardName: String) {
        if (cardType == "transportCard"){
            transportCard = TransportCardReader()
            transportCard?.readTransportCard(cardName)
        }
    }
}