import org.scalatest._
import codility01.Solution._

class Codility01Spec extends FlatSpec with Matchers {

  "A BinaryGap" should "return a zero for all binary strings without a gap" in {
    solution(0) should be (0)
  }

  it should "return 2 for 6" in {
    solution(328) should be (2)
  }

  it should "return 2 for 9" in {
    solution(9) should be (2)
  }

  it should "return 4 for 529" in {
    solution(529) should be (4)
  }

  it should "return 1 for 20" in {
    solution(20) should be (1)
  }

  it should "return 0 for 15" in {
    solution(15) should be (0)
  }

  it should "return 0 for 32" in {
    solution(32) should be (0)
  }

  it should "return 2 for 328" in {
    solution(328) should be (2)
  }


  it should "return 5 for 1041" in {
    solution(1041) should be (5)

  }

  it should "return 3 for 1162" in {
    solution(1162) should be (3)

  }

  it should "return 9 for 66561" in {
    solution(66561) should be (9)

  }

  /*
  "A BinaryGap" should "return a zero for all binary strings without a gap" in {
    solution1(0) should be (0)
  }

  it should "return 2 for 9" in {
    solution1(9) should be (2)
  }
  it should "return 4 for 529" in {
    solution1(529) should be (4)
  }
  it should "return 1 for 20" in {
    solution1(20) should be (1)
  }
  it should "return 0 for 15" in {
    solution1(15) should be (0)
  }
  it should "return 0 for 32" in {
    solution1(32) should be (0)
  }
  it should "return 5 for 1041" in {
    solution1(1041) should be (5)

  }
   */
}
