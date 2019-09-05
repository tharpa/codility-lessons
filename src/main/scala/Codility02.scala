package codility02

object Solution {
  def solution(a: Array[Int]): Int = {
    val N = a.length
    val p = Array.ofDim[Int](N)

    var i = 0
    while (i < N) {
      var j = i + 1
      while (j < N) {
        if (p(j) == 0 && a(i) == a(j)) {
          p(i) = 1
          p(j) = 1
        }
        j += 1
      }
      i += 1
    }

    // The problem conditions state that there will always be one unpaired though
    a(p.indexOf(0))
  }
}

/* count number of occurances per elements and keep a pointer on the odd number */
