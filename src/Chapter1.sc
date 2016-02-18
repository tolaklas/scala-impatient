import scala.math._ //OR import math._
//REPL -> Real Eval Print Loop


//---------------
"SECTION 1.2 - Declaring Values and Variables"

//Constant, i.e. immutable
val const = 23 * 3
//Variable, i.e. mutable
var a = 123 * 4 + 3
0.5 * a
a = 12
0.1 * a
var b = 11

var test1: String = "Hello World"
//---------------
"SECTION 1.3 - Commonly used types"

//This does not work:
//var test2, test3: String = "Hello World"
1.toString
1.to(10)
"Hello".intersect("World")
99.99.toInt
99.99.toFloat
99.99.round
//---------------
"SECTION 1.4 - Arithmetic and operator overloading"
a + b
a.+(b) //+ is actually a method!!!
1 to 10
//a++ DOES NOT WORK
a
a += 3
a
val x: BigInt = 1234567890
x * x * x
//---------------
"SECTION 1.5 - Calling functions and methods"
//The following need package scala.math._
sqrt(2)
pow(2, 3)
min(3, Pi)

BigInt.probablePrime(100, util.Random)
//---------------
"SECTION 1.6 - The apply method"
"Helllllo".distinct
"Hello"(0)
"Hello".apply(4)
BigInt("1234567890")
BigInt.apply("1234567890")
Array(1, 3, 6, 12)
Array.apply(1, 3, 6, 12)
"---------"
"EXERCISES"
"---------"
print ("Exercise 1. In the Scala REPL, type 3. followed by the Tab key\n" +
  "What methods can be applied?")
3
print ("Exercise 2. In the Scala REPL, compute the square root of 3,\n" +
  "and then square that value. By how much does\n" +
  "the result differ from 3? (Hint: The res variables are your friend.")
pow(sqrt(3), 2)

print ("Exercise 3. Are the res variables val or var?")
print ("Exercise 4. Scala lets you multiply a string with a number—\n" +
  "try out \"crazy\" * 3 in the REPL. What does this operation do?" +
  "Where can you find it in Scaladoc?")

"crazy" * 3
print ("Exercise 5. What does 10 max 2 mean? In which class is the max\n" +
  "method defined?")

print ("Exercise 6. Using BigInt, compute 2 to the power of 1024.")
//BigInt(pow(2, 1024))

print ("Exercise 7. What do you need to import so that you can get a\n" +
  "random prime as probablePrime(100, Random), without any qualifiers\n" +
  "before probablePrime and Random?")

print ("Exercise 8. One way to create random file or directory names is\n" +
  "to produce a random BigInt and convert it to base 36, yielding a string\n" +
  "such as \"qsnvbevtomcj38o06kul\". Poke around Scaladoc to find a way of\n" +
  "doing this in Scala.")

print ("Exercise 9. How do you get the first character of a string in Scala?\n" +
  "The last character?")

print ("Exercise 10. What do the take, drop, takeRight, and dropRight string\n" +
  "functions do? What advantage or disadvantage do they have over using substring?")

