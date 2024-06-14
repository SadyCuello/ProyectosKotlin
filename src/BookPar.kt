
class MyBook(val title: String, val author: String, val year: Int) {

    fun getTitleAndAuthor(): Pair<String, String> {
        return Pair(title, author)
    }
    fun getBookDetails(): Triple<String, String, Int> {
        return Triple(title, author, year)
    }
}

fun main() {

    val book = MyBook("The Great Gatsby", "F. Scott Fitzgerald", 1925)

    val (title, author) = book.getTitleAndAuthor()
    println("Titulo y autor: $title escrito por :  $author")

    val (titleDetail, authorDetail, yearDetail) = book.getBookDetails()
    println("Titulo, Autor y ano : $titleDetail escrito por $authorDetail en $yearDetail")

    println("Este es tu libro \"$titleDetail\" escrito por $authorDetail en $yearDetail.")
}
