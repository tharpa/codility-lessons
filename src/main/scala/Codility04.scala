package codility04

object Solution {
  def solution(x: Int, y: Int, d: Int): Int = {

    if ((y - x) % d == 0) (y - x)/d else (y - x)/d + 1
  }
}
