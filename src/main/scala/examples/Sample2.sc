import org.scalatest.matchers.should.Matchers._

def foldOptions(res0: Int, res1: Int): Unit = {

  val number: Option[Int] = Some(3)
  val noNumber: Option[Int] = None
  val result1 = number.fold(1)(_ * 3)
  val result2 = noNumber.fold(1)(_ * 3)

  result1 should be(res0)
  result2 should be(res1)
}

foldOptions(9, 1)