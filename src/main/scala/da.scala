package da

object Scratch {
  def movingAverage(xs: Seq[Int], w: Int): Seq[Double] = {
    def avg(zs: Seq[Int]): Double = {
      if (zs.size > 0) zs.sum / zs.size
      else 0.0
    }

    if (w > 0 && w <= xs.size) {
      xs match {
        case Nil => Seq[Double]()
        case _ =>
          for {
            i <- 0 to (xs.size - w)
          } yield avg(xs drop i take w)
      }
    } else throw new IllegalArgumentException
  }

  def movingAverageRec(xs: List[Int], w: Int): List[Double] = {
    def avg(zs: List[Int]): Double = if (zs.size > 0) zs.sum / zs.size else 0.0

    if (0 < w && w <= xs.size)
      xs match {
        case Nil => Nil
        case ys if ys.size > w => avg(ys take w) :: movingAverageRec(ys.tail, w)
        case zs => avg(zs) :: Nil
      }
    else throw new IllegalArgumentException
  }
}
