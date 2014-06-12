package com.meetfp.examples.vantage

/**
 * Examples of scala tutorials on http://meetfp.com/
 * Created by dengchunni
 */
object Reducing extends App {
  val nums = Array(1, 2, 3)
  val sum = nums.fold(0)(_ + _)
  val sumReduce = nums.reduce(_ + _)
  println("sum = " + sum)
  println("sumReduce = " + sumReduce)

  val nilFold = Nil.fold(0)(_ + _)
  //val nilReduce = Nil.reduce(_ + _)
  //missing parameter type for expanded function

  val nil: List[Int] = Nil
  //val nilReduce = nil.reduce(_ + _)
  //java.lang.UnsupportedOperationException: empty.reduceLeft
  val nilReduce = nil.reduceOption(_ + _)
  println("nilFold = " + nilFold)
  println("nilReduce = " + nilReduce)

  val res = nums.fold("")(_ + _.toString + ",")
  println(res)

}
