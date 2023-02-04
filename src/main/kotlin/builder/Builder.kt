package builder
class Document private constructor(builder: DocumentBuilder){

    private val header: String?
    private val body: String?
    private val footer: String?

  init {
      this.header = builder.header
      this.body = builder.body
      this.footer = builder.footer
  }

  class DocumentBuilder{
      var header: String? = null
          private set
      var body: String? = null
          private set
      var footer: String? = null
          private set

      fun header(headerText: String) = apply { this.header = headerText }
      fun body(bodyText: String) = apply { this.body = bodyText }
      fun footer(footerText: String) = apply { this.footer = footerText }

      fun build() = Document(this)
  }
}
fun main() {
    val document = Document.DocumentBuilder()
        .header("Должностная инструкция")
        .body("описание должностных инструкций")
        .footer("Подпись")
        .build()
}