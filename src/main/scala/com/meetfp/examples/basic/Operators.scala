package com.meetfp.examples.basic

/**
 * Examples of scala tutorials on http://meetfp.com/
 * Created by dengchunni
 */
object BinaryOperators extends App {
  val sum1 = 1 + 2                                //3
  println("1 + 2 = " + sum1)

  val sum2 = (1).+(2)                             //3
  println("(1).+(2) = " + sum2)

  val str1 = "Hello".drop(2)                      //"llo"
  println("\"Hello\".drop(2) = " + str1)

  val str2 = "Hello" drop 2                       //"llo"
  println("\"Hello\" drop 2 = " + str2)
}

object UnaryOperators extends App {
  println(-2.0)
  println((2.0).unary_-)

  println(true)
  println(false.unary_!)
}

object MethodIsOperator extends App {
  val x: BigInt = 1003
  println(x * x * x)      //1009027027
  println(x /% 5)         //(200,3)
}
