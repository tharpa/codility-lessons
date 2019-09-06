package codility03

object Solution {
  def solution(a: Array[Int], k: Int): Array[Int] = {
    def shiftRight(a: Array[Int]): Array[Int] = {
       a.last +: a.dropRight(1)
    }

    if (k == 0) a else solution(shiftRight(a), k - 1)
  }
}
