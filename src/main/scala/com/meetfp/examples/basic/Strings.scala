package com.meetfp.examples.basic

/**
 * Examples of scala tutorials on http://meetfp.com/
 * Created by dengchunni
 */
object Strings extends App {
  val str = "Hello"
  val r1 = str.drop(2)  //"llo"
  println("\"Hello\".drop(2) = " + r1)

  val r2 = str.dropRight(2) //"Hel"
  println("\"Hello\".dropRight(2) = " + r2)

  val r3 = str.filter( _ != 'l') //"Heo"
  println("\"Hello\".filter( _ != 'l') = " + r3)

  val r4 = str.intersect("world")  //"lo"
  println("\"Hello\".intersect(\"world\") = " + r4)
}

object StringBuilder extends App {
  val builder = new StringBuilder
  builder.append("Hello")
  builder.append(", world")
  builder += '!'
  builder.insert(0,"Me: ")
  println(builder)   //Me: Hello, world!
}
