var capital = Map("US" -> "Washington", "France" -> "Paris")
capital += ("Japan" -> "Tokyo")
printf(capital("France"))

def factorial(x: BigInt): BigInt =
  if (x == 0)
    1
  else
    x * factorial(x - 1)

factorial(30)


1 + 2

res3 * 3

val msg = "Hello, World!"
println(msg)
//msg = "Goodbye"
var greeting = "Hello World!"
println(greeting)
greeting = "Leave me alone, world!"
println(greeting)


def max(x: Int, y: Int): Int = if (x > y) x else y

max(3, 5)

def greet(): Unit = println("Hello World!")