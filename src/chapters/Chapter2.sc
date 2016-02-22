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

