package adapter

class CardReaderImpl: CardAdapter() {
    override fun read(cardType: String, cardName: String) {
        if (cardType.equals("bankCard",true)){
            println("reading bank card $cardName")
        } else if (cardType.equals("transportCard",true)){
            CardAdapter().read(cardType,cardName)
        } else {
            println("fail $cardType not supported")
        }
    }
}