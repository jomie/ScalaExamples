package com.meetfp.examples.vantage

/**
 * Examples of scala tutorials on http://meetfp.com/
 * Created by dengchunni
 */

object Implicites extends App {
  abstract class TimeDuration {
    def toMillis: Int
    override def toString = "we got %d millis".format(toMillis)
  }
  case class Seconds(length: Int) extends TimeDuration {
    def toMillis = length * 1000
  }
  case class Minutes(length: Int) extends TimeDuration {
    def toMillis = length * 1000 * 60
  }
  case class Hours(length: Int) extends TimeDuration {
    def toMillis = length * 1000 * 60 * 60
  }

  class Duration(length: Int) {
    def seconds = Seconds(length)
    def minutes = Minutes(length)
    def hours = Hours(length)
  }

  println(new Duration(2) seconds)

  implicit def IntToDuration(i: Int) = new Duration(i)
  println(2 seconds)
  println(3 minutes)
  println(4 hours)
}

object ImplicitsEx extends App {
  abstract class TimeDuration {
    def toMillis: Int
    override def toString = "we got %d millis".format(toMillis)
  }
  case class Seconds(length: Int) extends TimeDuration {
    def toMillis = length * 1000
  }
  case class Minutes(length: Int) extends TimeDuration {
    def toMillis = length * 1000 * 60
  }
  case class Hours(length: Int) extends TimeDuration {
    def toMillis = length * 1000 * 60 * 60
  }

  implicit class IntExtendToDuration(i: Int) {
    def seconds = Seconds(i)
    def minutes = Minutes(i)
    def hours = Hours(i)
  }

  println(2 seconds)
  println(3 minutes)
  println(4 hours)
}
