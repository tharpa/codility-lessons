package codility02

object Solution {
  def solution(a: Array[Int]): Int = {
    val odd = scala.collection.mutable.Set[Int]()

    for (e <- a) if (odd contains e) odd -= e else odd += e

    // what to do with a case where the initial condition is violated?
    if (odd.nonEmpty) odd.head else -1
  }
}
