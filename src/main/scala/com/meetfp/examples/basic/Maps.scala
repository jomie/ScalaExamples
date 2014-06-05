package com.meetfp.examples.basic

/**
 * Examples of scala tutorials on http://meetfp.com/
 * Created by dengchunni
 */
object MutableMap extends App{
  val teachers = scala.collection.mutable.Map("Chunni" -> "History")
  teachers += "Jim" -> "Math"
  teachers("Zhou") = "English"
  println(teachers)
}

object GetMapItem extends App {
  val scores = Map(("Jackie", 90), ("Abby", 93), ("Tim", 87))
  val caps = Map("China" -> "Beijing", "France" -> "Paris", "Norway" -> "Oslo")

  //scores("no") //will throw an exception, key not found
  val score = scores.get("no")  //None
  if(score.isEmpty) {
    //handle the empty case
  }

  println(scores.getOrElse("no", 90)) //90
}

object Iterating extends App {
  val capitals = Map("China" -> "Beijing", "France" -> "Paris", "Norway" -> "Oslo")

  println("---use key iterator---")
  val itr = capitals.keysIterator
  while (itr.hasNext)
    println(itr.next())

  println("---use for on KeySet---")
  for(k <- capitals.keySet)
    println(capitals(k))

  println("---use for on key value pair---")
  for((k, v) <- capitals)
    println("The capital of %s is %s".format(k, v))
}

object Sorted extends App {
  import scala.collection.immutable.TreeMap
  var capitals = TreeMap("China" -> "Beijing", "Norway" -> "Oslo", "France" -> "Paris")
  capitals += "Austria" -> "Vienna"
  println(capitals)  //sorted

  import scala.collection.mutable.LinkedHashMap
  val mutable = LinkedHashMap("China" -> "Beijing", "Norway" -> "Oslo", "France" -> "Paris")
  mutable += "Austria" -> "Vienna"
  println(mutable)  //insertion order

}