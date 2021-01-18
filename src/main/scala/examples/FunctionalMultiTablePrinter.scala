package examples

class FunctionalMultiTablePrinter {
  private def makeRowSeq(row: Int) = {
    for (col <- 1 to 10) yield {
      val prod = (row * col).toString
      val padding = " " * (4 - prod.length)
      padding + prod
    }
  }

  private def makeRow(row: Int) = makeRowSeq(row).mkString

  def multiTable(): String = {
    val tableSeq =
      for (row <- 1 to 10)
        yield makeRow(row)

    tableSeq.mkString("\n")
  }
}

object FunctionalMultiTablePrinter extends App {
  val printer = new FunctionalMultiTablePrinter
  println(printer.multiTable())
}
