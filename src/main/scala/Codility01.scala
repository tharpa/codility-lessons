package codility01

object Solution {
  def solution(n: Int): Int = {
    var gap = 0
    val ns = n.toBinaryString.toCharArray()

    var i = 0
    while (i < ns.length) {

      if (ns(i) == '1') {
        var lgap = 0
        while (i < ns.length - 1 && ns(i+1) == '0') {
          lgap += 1
          i += 1
        }
        if (i < ns.length - 1 && ns(i+1) == '1')
          gap = gap max lgap
      }
      i += 1
    }

    gap
  }

  def solutionRegex(n: Int): Int = {
    var gap = 0
    val ns = n.toBinaryString
    val gapRegex = raw"1(0+)1".r

    val gaps = gapRegex.findAllIn(ns)
    while (gaps.hasNext)
      gap = gap max (gaps.next.length() - 2)

    gap
  }
}
