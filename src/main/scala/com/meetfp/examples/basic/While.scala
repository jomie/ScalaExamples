package com.meetfp.examples.basic

/**
 * Examples of scala tutorials on http://meetfp.com/
 * Created by dengchunni
 */
object While extends App {
  def reverse(number: Int) = {
    var result = 0
    var temp = number
    while (temp != 0) {
      result = 10 * result + temp % 10
      temp /= 10
    }
    result
  }

  println(reverse(12345))
}

object DoWhile extends App {
  val i = 0

  do {
    println("executed once")
  } while( i != 0)
}
