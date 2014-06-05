package com.meetfp.examples.basic

/**
 * Examples of scala tutorials on http://meetfp.com/
 * Created by dengchunni
 */
object NormalIf extends App {
  val startingPoint = 80

  def check(current: Int) {
    if(current > startingPoint)
      println("Wow! we are going up!")
    else
      println("Uh~oh~~ not good~~")
  }

  check(90)
  check(75)
}

object AssignWithIf extends App {
  def printAbs(x: Int) {
    val abs = if(x < 0) -x else x
    println("The Abs of %d is %d".format(x, abs))
  }

  def abs(x: Int) = if(x < 0) -x else x

  printAbs(-5)
  println(abs(-6))
}
