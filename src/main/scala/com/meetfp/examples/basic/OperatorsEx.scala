package com.meetfp.examples.basic

/**
 * Examples of scala tutorials on http://meetfp.com/
 * Created by dengchunni
 */
object LogicOperators  extends App {
  def trueSta = {println("evaluate 1 < 2 = true");1 < 2}
  def falseSta = {println("evaluate 2 > 3 = false"); 2 > 3}
  println(trueSta)
  println(falseSta)

  println("------------------------------")
  println("Short-circuit (true || anything ):")
  val ret = trueSta || falseSta

  println("------------------------------")
  println("Short-circuit (false && anything ):")
  val ret1 = falseSta && trueSta
}

object BitOperators extends App {
  println("1 & 2 = " + (1 & 2))     //1 & 2 = 0
  println("1 | 2 = " + (1 | 2))     //1 | 2 = 3
  println("2 ^ 3 = " + (2 ^ 3))     //2 ^ 3 = 1
  println("~4 = " + (~4))           //~4 = -5

  println("4 >> 1 = " + (4 >> 1))   //4 >> 1 = 2
  println("4 << 2 = " + (4 << 2))   //4 << 2 = 16

  println("-1 >> 31 = " + (-1 >> 31)) //-1 >> 31 = -1
  println("-1 >>> 31 = " + (-1 >>> 31)) //-1 >>> 31 = -1
}