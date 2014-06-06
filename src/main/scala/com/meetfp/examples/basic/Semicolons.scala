package com.meetfp.examples.basic

/**
 * Examples of scala tutorials on http://meetfp.com/
 * Created by dengchunni
 */
object Semicolons  extends App {
  val hi = "Hi, Nini"; println(hi)
  val msg = ("Hello everybody,"
    + "my name is Nini")    //A statement is not over if the parentheses don't match
  println(msg)
  val ret = 3 + 4 +                //This is a sign that the statement is not over
    5
  println(ret)
}
