import javax.xml.stream.events.Characters

fun main(){
   var y =productIntArray(arrayOf(11,10,100))
   println(y)
   var z = sumIntegers(arrayOf("John",22.3,"Harambee",11.3,true))
    println(z)
    var a =Characters(arrayOf('a','b','c','e','i','o','u','d'))
    println(a)
}
//function that takes in an array of integers and returns the product of
//all the elements
fun productIntArray(numbers:Array<Int>):Int {
    var product = 1
    numbers.forEach { number ->
        product *= number
    }
    return product
}


//function that takes in an array of mixed types and returns the sum of
//all the decimal elements
fun sumIntegers(mixedArray:Array<Any>):Double {
    var sum = 0.0
    mixedArray.forEach { num ->
        if (num is Double) {
            sum += num
        }
    }
    return sum

}
//function that takes in an array of characters and returns the number of
//vowels in the array
fun Characters(vowels:Array<Char>):Int {
    var char = 0
    vowels.forEach { letters ->
        if (letters == 'a' || letters == 'e' || letters == 'i' || letters == 'o' || letters =='u')
        ++char
    }
    return char
}