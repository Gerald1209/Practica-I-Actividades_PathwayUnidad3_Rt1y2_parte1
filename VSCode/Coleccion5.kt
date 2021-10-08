fun main() {
    val words = listOf("about", "acute", "awesome", "balloon", "best", "brief", "class", "coffee", "creative")
    val filteredWords1 = words.filter { it.startsWith("b", ignoreCase = true) }
        .shuffled()
        .take(2)
        .sorted()
    println(filteredWords1)

    val filteredWords2 = words.filter { it.startsWith("c", ignoreCase = true) }
        .shuffled()
        .take(1)
        .sorted()
    println(filteredWords2)
}