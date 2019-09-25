import org.scalatest._
import da.Scratch._

class DaSpec extends FlatSpec with Matchers {

  "A moving average of List(1, 2, 3, 4, 5) and window 3" should "be List(2.0, 3.0, 4.0)" in {
    movingAverageRec(List(1, 2, 3, 4, 5), 3) should be(List(2.0, 3.0, 4.0))
  }

  it should "throw IllegalArgumentException for an empty sequence" in {
    a [IllegalArgumentException] should be thrownBy {
      movingAverageRec(List(), 2)
    }
  }

  it should "throw IllegalArgumentException for a 0 window size" in {
    a [IllegalArgumentException] should be thrownBy {
      movingAverageRec(List(1, 2, 3, 4, 5), 0)
    }
  }
}
