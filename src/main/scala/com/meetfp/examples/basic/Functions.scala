package com.meetfp.examples.basic

/**
 * Examples of scala tutorials on http://meetfp.com/
 * Created by dengchunni
 */
object Functions extends App{
  def add(x: Int, y: Int) : Int = {
    x + y
  }
  println("2 + 3 = " + add(2,3))
}

object Procedures extends App {
  def sayHiTo(name: String) {
    println("Hi, " + name)
  }
  sayHiTo("Nini")
}
