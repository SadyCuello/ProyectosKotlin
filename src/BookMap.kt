fun main() {

    val allBooks: Set<String> = setOf("Hamlet", "Macbeth", "Othello", "King Lear", "Romeo and Juliet")

    val library: Map<String, Set<String>> = mapOf("William Shakespeare" to allBooks)

    val containsHamlet = library.any { (_, books) -> books.contains("Hamlet") }
    println("Libreria contiene 'Hamlet': $containsHamlet")

    val moreBooks: MutableMap<String, String> = mutableMapOf("J.K. Rowling" to "Harry Potter y la cámara de los secretos")

    val bookTitle = "Harry Potter y la cámara de los secretos"
    val author = moreBooks.getOrPut(bookTitle) { "J.K. Rowling" }
    println("Autor de '$bookTitle': $author")

    println("Mas libros mapa: $moreBooks")
}
