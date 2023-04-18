fun main() {
fizzBuzz()
    oddNumbers()
}

//Write a function that prints each number from 1 to 100 on a new line. For each
//multiple of 3, print "Fizz" instead of the number. For each multiple of 5, print
//"Buzz" instead of the number. For numbers which are multiples of both 3 and
//5, print "FizzBuzz" instead of the number.
fun fizzBuzz() {
    for (num in 1..100){
        if (num % 3 == 0 && num % 5 ==0)
            println("FizzBuzz")
        else if (num % 5 == 0){
            println("Buzz")
        }
        else if(num % 3 == 0 ){
            println("Fizz")
        }
        else{
            println(num)
        }
    }
}

//Create a function that prints out all the odd numbers between 1 and 100
fun oddNumbers(){
    var nums= 1..100
    for (num in nums){
        if (num % 2!=0)
            println(num)
    }

}