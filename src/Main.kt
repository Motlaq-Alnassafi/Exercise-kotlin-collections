fun main() {
    // Part 1
    val favoriteFruits = mutableListOf("Apple", "Mango", "Orange")
    favoriteFruits.removeAt(1)
    favoriteFruits.add("Grapes")
    println(favoriteFruits)

    //Part 2
    val uniqueValues = mutableSetOf(1, 2, 3, 3, 4, 5, 5)
    uniqueValues.add(3)
    uniqueValues.add(6)
    println(uniqueValues)

    //Part 3
    val capitals = mutableMapOf("USA" to "Washington", "France" to "Paris", "Germany" to "Berlin")
    capitals["Canada"] = "Ottawa"
    println("Countries: ${capitals.keys}")
    println("Capitals: ${capitals.values}")
    capitals.remove("France")
    println("Final Map: ${capitals}")

    //Part 4
    val carBrands = arrayListOf("BMW", "Toyota", "Honda")
    carBrands.add("Ford")
    carBrands.add("Tesla")
    carBrands.removeLast()
    println(carBrands)

    //Part 5
    val number = listOf(10, 5, 20, 15, 25, 30)
    val numbersGreaterThan = number.filter { it > 15 }
    println("Number greater than 15: $numbersGreaterThan")
    println("Sorted List: ${number.sorted()}")

    //Part 6
    val floatingPointList = listOf(2.5, 7.1, 3.8, 9.2, 5.6)
    println("Largest number: ${floatingPointList.maxOrNull()}")
    println("Smallest number: ${floatingPointList.minOrNull()}")
}