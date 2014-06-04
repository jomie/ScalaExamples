package com.meetfp.examples.basic

/**
 * Examples of scala tutorials on http://meetfp.com/
 * Created by dengchunni
 */
object Import extends App {
  println("import can be anywhere")
  import scala.collection.mutable.HashSet

  val set = HashSet(2)
  println(set.getClass.getName)
}

object ImportPackage extends App {
  import scala.collection.mutable

  val mSet = mutable.TreeSet(3,9)
  mSet += 5
  mSet += 1
  println(mSet)
}

object ImportMultiple extends App {
  //import all members from mutable
  import scala.collection.mutable._
  val map = Map("Abby" -> 90)
  println(map.getClass.getName)

  //import multiple members
  import _root_.scala.collection.immutable.{TreeMap, TreeSet}
  val map1 = TreeMap("Abby" -> 90)
  println(map1.getClass.getName)
}

object RenameHide extends App {
  //rename
  import scala.collection.mutable.{TreeSet => MTSet}

  val mtSet = MTSet(3,9)
  println(mtSet.getClass.getName)

  //hide
  import scala.io
  import scala.io.{Source => _}
  //Source.fromString("")  //won't compile

  //above two import equals to following one
  import scala.io.{Source => _, _}
}