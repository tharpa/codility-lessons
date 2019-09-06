package codility03

object Solution {
  def solution(a: Array[Int], k: Int): Array[Int] = {
    def shiftRight(a: Array[Int]): Array[Int] = {
      if (a.nonEmpty) a.last +: a.dropRight(1) else a
    }

    if (k == 0) a else solution(shiftRight(a), k - 1)
  }
}
