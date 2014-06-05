package com.meetfp.examples.basic

/**
 * Examples of scala tutorials on http://meetfp.com/
 * Created by dengchunni
 */
object Numeric extends App {
  val n1 = 2 max 3
  println("2 max 3 = " + n1)

  val n2 = -1.abs
  println("-1.abs = " + n2)

  val n3 = 1 to 5
  println("1 to 5 = " + n3)

  val n4 = 1.isValidChar
  println("1.isValidChar = " + n4)

  val n5 = -1.isValidChar
  println("-1.isValidChar = " + n5)
}
