package com.meetfp

/**
 * Created by dengchunni on 14-6-4.
 */
object AppWithMain extends App {
  //Fields will not be initiated before the main method
  val plainVal = "plain val will not be initiated here"
  lazy val lazyVal = "lazy val will be initiated the first time accessed"
  final val finalVal = "final val will be initiated"
  def method = "Of cause, method will be evaluated every time being called"

  override def main(args: Array[String]) {
    println(plainVal) //will be null
    println(lazyVal)
    println(finalVal)
    println(method)
  }
}

