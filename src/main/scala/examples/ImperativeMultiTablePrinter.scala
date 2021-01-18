package examples

object ImperativeMultiTablePrinter extends App {
  // variables visibility
  private var i = 1
  // there is only 1 variable - 'i'
  while (i <= 10) {
    var j = 1
    // there are already 2 variables - 'i' and 'j'
    while (j <= 10) {
      val prod = (i * j).toString
      // there are 3 variables which are visible - 'i', 'j' and 'prod'
      var k = prod.length
      // there are 4 variables are visible - 'i', 'j', 'prod' and 'k'
      while (k <= 4) {
        print(" ")
        k += 1
      }

      print(prod); j += 1
    }
    // 'i' and 'j' are still visible, but 'prod' and 'k' aren't
    println(); i += 1
  }
  // 'i' is still visible, but 'j', 'prod' and 'k' aren't
}
