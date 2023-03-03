fun main() {
    fruits()
    cities()
    variety()
    println(names("Jojo","Amy","Hale"))
}
//Create a function that takes in 4 strings and creates an array out of them then prints out the array.
fun fruits() {
    var fruits = arrayOf("Kiwi", "Apple", "Mango", "Beetroot")
    println(fruits.contentToString())
}
//Create a function that prints out of the names of the cities in the correct grammatical case.
fun cities(){
    var cities= arrayOf("harare","mumbai","dodoma","jakarta")
    println(cities.map { it.capitalize() })
}
//Create one function that given the below array:
//
//var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
//(i) prints out the sum of the second and fifth elements (1 point)
//(ii) prints out the index of 158 (1 point)
//(iii) prints out the elements in ascending order
fun variety(){
    var numbers= arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
    var sum= numbers[2]+numbers[5]
    println(sum)
    println(numbers.indexOf(158))
    println(numbers.sortedArray().contentToString())
}
//Create a function that takes in 3 names and returns a string array containing
//all 3 names.
fun names(name1:String,name2:String,name3: String):String{
var jina=arrayOf(name1,name2,name3)
    return jina.contentToString()
}

