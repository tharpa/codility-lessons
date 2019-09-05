package codility02

object Solution {
  def solution(a: Array[Int]): Int = {
    val N = a.length
    val odd = scala.collection.mutable.Set[Int]()

    var i = 0
    while (i < N) {
      if (odd contains a(i)) odd -= a(i) else odd += a(i)

      i += 1
    }

    // what to do with a case where the initial condition is violated?
    if (odd.nonEmpty) odd.head else -1
  }
}
