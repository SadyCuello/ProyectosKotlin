open class Book(val title: String, val author: String) {
    private var currentPage: Int = 0

    open fun readPage() {
        currentPage++
    }

    fun getCurrentPage(): Int {
        return currentPage
    }
}

class eBook(title: String, author: String, val format: String = "text") : Book(title, author) {
    private var wordCount: Int = 0

    override fun readPage() {
        wordCount += 250
    }

    fun getWordCount(): Int {
        return wordCount
    }
}

fun main() {
    val physicalBook = Book("1984", "George Orwell")
    physicalBook.readPage()
    println("Página actual del libro físico: ${physicalBook.getCurrentPage()}")

    val electronicBook = eBook("Nuevo mundo valiente", "Aldous Huxley")
    electronicBook.readPage()
    println("Recuento actual de palabras del libro electronico: ${electronicBook.getWordCount()}")
}
