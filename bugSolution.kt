fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    val toRemove = mutableListOf<Int>()
    list.forEach { if (it % 2 == 0) toRemove.add(it) }
    toRemove.forEach { list.remove(it) }
    println(list) // Output: [1, 3, 5]

    val map = mutableMapOf("a" to 1, "b" to 2, "c" to 3)
    val keysToRemove = mutableListOf<String>()
    map.forEach { if (it.value % 2 == 0) keysToRemove.add(it.key) }
    keysToRemove.forEach { map.remove(it) }
    println(map) //Output: {a=1, c=3}
    
    //Alternative using filter
    val newList = list.filter { it % 2 != 0 }
    println(newList) //Output: [1,3,5]
    
    val newMap = map.filterValues { it % 2 != 0 }
    println(newMap) // Output: {a=1, c=3}
} 