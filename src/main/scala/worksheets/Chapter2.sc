//---------------
"SECTION 2.1 - Declaring Values and Variables"
var x = 13
val s = if (x > 0) 1 else -1
if (x > 0) "positive" else -1
if (x < 0) 1 else ()
for (i <- 1 to 10) {
  println(i)
}
for (i <- 1 until 10) {
  println(i)
}
for (i <- 1 to 3; j <- 7 to 9) print((10 * i + j) + " ")
for (i <- 1 to 3; j <- 1 to 3 if i != j) print((10 * i + j) + " ")
for (i <- 1 to 3; from = 4 - i; j <- from to 3) print((10 * i + j) + " ")
for (i <- 1 to 10) yield i % 3
for (c <- "Hello"; i <- 0 to 1) yield (c + i).toChar
// Yields "HIeflmlmop"
for (i <- 0 to 1; c <- "Hello") yield (c + i).toChar
// Yields Vector('H', 'e', 'l', 'l', 'o', 'I', 'f', 'm', 'm', 'p')
"SECTION 2.7 - Functions"
def abs(x: Double) = if (x >= 0) x else -x
def fac(n: Int): Int = if (n <= 0) 1 else n * fac(n - 1)
def decorate(str: String, left: String = "[", right: String = "]") = left + str + right
decorate("Hello", "{")
decorate(str = "Hello", right = "}")
"SECTION 2.9 - Variable arguments"
def sum(args: Int*) = {
  var result = 0
  for (arg <- args) result += arg
  result
}
def recursiveSum(args: Int*) : Int = {
  if (args.isEmpty) 0
  else args.head + recursiveSum(args.tail : _*)
}
sum(1 to 12: _*) //Consider 1 to 12 as an argument sequence
recursiveSum(1 to 12: _*)
"SECTION 2.10 - Procedures"
def box(s : String) { // Look carefully: no =
  val border = "-" * s.length + "--\n"
  println(border + "|" + s + "|\n" + border)
}

box("Tolis")
"SECTION 2.11 - Lazy values"
lazy val words = scala.io.Source.fromFile("/usr/share/dict/words").mkString

//Exercise 3
var p: Unit
var q: Int = 0
p = q = 1

