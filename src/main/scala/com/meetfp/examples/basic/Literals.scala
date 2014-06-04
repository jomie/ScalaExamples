package com.meetfp.examples.basic

/**
 * Examples of scala tutorials on http://meetfp.com/
 * Created by dengchunni
 */
object FunctionLiteral extends App {
  val fun =
  new Function2[Int, Int, Int] {
    def apply(x: Int, y: Int): Int = x + y
  }

  val result = fun(2,4)
  println("Result = " + result)
  result
}
