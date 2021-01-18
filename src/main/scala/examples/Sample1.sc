import rational.Rational

import java.io.{File, FileNotFoundException, FileReader, IOException}
import java.math.BigInteger
import scala.collection.mutable
import scala.io.Source

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

val big = new BigInteger("12345")

val greetStrings = new Array[String](3)
greetStrings(0) = "Hello"
greetStrings(1) = ", "
greetStrings(2) = "world!\n"
for (i <- 0 to 2) {
  print(greetStrings(i))
}
val numNames2 = Array("zero", "one", "two")

val oneTwoThree = List(1, 2, 3)


val oneTwo = List(1, 2)
val threeFour = List(3, 4)
val oneTwoThreeFour = oneTwo ::: threeFour
println(oneTwo + " and " + threeFour + " were not mutated")
println("Thus, " + oneTwoThreeFour + " is a new list")

val twoThree = List(2, 3)
val oneTwoThree = 1 :: twoThree
println(oneTwoThree)

val oneTwoThree = 1 :: 2 :: 3 :: Nil

// 3.4 tuples
val pair = (99, "Luftballons")
println(pair._1)
println(pair._2)

// 3.5 immutable set
var jetSet = Set("Boeing", "Airbus")
jetSet += "Lear"
println(jetSet.contains("Cessna"))

// 3.6 mutable set
var movieSet = mutable.Set("Hitch", "Poltergeist")
movieSet += "Shrek"
println(movieSet)

// 3.7 mutable map
val treasureMap = mutable.Map[Int, String]()
treasureMap += (1 -> "Go to island.")
treasureMap += (2 -> "Find big X on ground.")
treasureMap += (3 -> "Dig.")
println(treasureMap(2))

// 3.8 immutable map
val romanNumeral = Map(1 -> "I", 2 -> "II", 3 -> "III", 4 -> "IV", 5 -> "V")
println(romanNumeral(4))

// 3.9 functional style
def formatArgs(args: Array[String]) = args.mkString("\n")
val res = formatArgs(Array("zero", "one", "two"))
assert(res == "zero\none\ntwo")

// 5 data types and operations
println(
  """Welcome to Ultamix 3000.
           Type "HELP" for help.""")
println(
  """|Welcome to Ultamix 3000.
     |Type "HELP" for help.""".stripMargin)

// 6. functional objects
val x = new Rational(1, 2)
//val ex = new Rational(5, 0)

val x = new Rational(1, 2)
val y = new Rational(2, 3)
//val rationResult = x + y
//rationResult.numer
//rationResult.denom

x + x * y
(x + x) * y

implicit def intToRational(i: Int): Rational =
  new Rational(i)
2 * y

// 7.2 loop while and do-while
def gcdLoop(x: Long, y: Long): Long = {
  var a = x
  var b = y
  while (a != 0) {
    val temp = a
    a = b % a
    b = temp
  }
  b
}

gcdLoop(324485, 1231)

// using ()
def greet(): Unit = {
  println("hi")
}
() == greet()

// use for with filter (if statement)
val curDir = "D:\\IdeaProjects\\scala-learn\\src\\main\\scala\\examples"
val filesHere = new File(curDir).listFiles
for (
file <- filesHere
if file.isFile
if file.getName.endsWith(".scala")
) println(file)

val rationalDir = curDir + "\\..\\rational"
val rationalFiles = new File(rationalDir).listFiles
def fileLines(file: File) = {
  val src = Source.fromFile(file)
  val linesList = src.getLines().toList
  src.close()
  linesList
}

def grep(pattern: String): Unit =
  for {
    file <- rationalFiles
    if file.getName.endsWith(".scala");
    line <- fileLines(file)
    trimmed = line.trim
    if trimmed.matches(pattern)
  } println(file.getAbsolutePath + ": " + trimmed)

grep(".*gcd.*")

val forLineLengths =
  for {
    file <- rationalFiles
    if file.isFile
    if file.getName.endsWith(".scala")
    line <- fileLines(file)
    trimmed = line.trim
    if trimmed.matches(".*val.*")
  } yield trimmed.length


// exceptions
def getHalf(n: Int): Int = {
  if (n % 2 == 0)
    n / 2
  else
    throw new RuntimeException("n must be even")
}
getHalf(3)

try {
  val f = new FileReader("input.txt")
  // use and close file
} catch {
  case ex: FileNotFoundException => println("File not found")
  case ex: IOException => println("IOException")
}