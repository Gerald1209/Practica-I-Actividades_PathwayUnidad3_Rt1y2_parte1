fun main() {
    //val triple: (Int) -> Int = { a: Int -> a * 3 }
    val triple: (Int) -> Int = { it * 3 }
    println(triple(5))
}