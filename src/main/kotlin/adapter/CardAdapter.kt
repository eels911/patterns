package adapter

open class CardAdapter: BankCard {
    private var transportCard: TransportCard? = null
    override fun read(cardType: String, cardName: String) {
        if (cardType.equals("transportCard",true)){
            if (transportCard == null){
                transportCard = TransportCardReader()
            }
            transportCard?.readTransportCard(cardName)
        }
    }
}