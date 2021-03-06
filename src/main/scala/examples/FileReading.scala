// 3.10 read lines from a file
package examples

import scala.io.Source

object FileReading extends App {
  if (args.length > 0) {
    val source = Source.fromFile(args(0))
    val lines = source.getLines().toList
    source.close()
    val longestLine = lines.reduceLeft((a, b) => if (a.length > b.length) a else b)
    val maxWidth = widthOfLength(longestLine)
    for (line <- lines) {
      val numSpaces = maxWidth - widthOfLength(line)
      val padding = " " * numSpaces
      println(padding + line.length + " | " + line)
    }
  } else Console.err.println("Please enter file name")

  def widthOfLength(line: String): Int = {
    line.length.toString.length
  }
}
