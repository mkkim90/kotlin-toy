package collectionspractice

fun main() {
    // immutuable
    val tests = listOf("test", "test1", "test2")

    // mutable
    val mutableTests = mutableListOf<String>().apply {
        add("test")
        add("test1")
        add("test2")
    }

    val mutableSet = mutableSetOf<Int>().apply {
        add(1)
        add(2)
        add(3)
    }

    // immutable map
    val numberMap = mapOf("one" to 1, "two" to 2)

    //mutable map
    val mutableNumberMap = mutableMapOf<String, Int>()
    mutableNumberMap["one"] = 1
    mutableNumberMap["two"] = 2
    mutableNumberMap["three"] = 1

    val lowerList = listOf("a", "b", "c")

    val upperList = lowerList.map {
        it.toUpperCase()
    }

    val filteredList = upperList.filter { it == "A" }
}