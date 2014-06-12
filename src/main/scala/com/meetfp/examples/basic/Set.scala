package com.meetfp.examples.basic

/**
 * Examples of scala tutorials on http://meetfp.com/
 * Created by dengchunni
 */
object Immutable extends App {
  val set = Set(1,2,3)
  println(set.getClass.getName) //scala.collection.immutable.Set

  println(set.exists(_ % 2 == 0)) //true
  println(set.drop(1)) //Set(2,3)

  import scala.collection.mutable.Set //import can be anywhere

  val mutableSet = Set(1,2,3)
  println(mutableSet.getClass.getName) //scala.collection.mutable.HashSet

  mutableSet.add(4)
  mutableSet.remove(1)
  mutableSet += 5
  mutableSet -= 2

  println(mutableSet) //Set(5, 3, 4)

  val another = mutableSet.toSet
  println(another.getClass.getName) //scala.collection.immutable.Set
}

object Sort extends App {
  import scala.collection.immutable.SortedSet

  val set = SortedSet(2, 6, 7, 3, 5, 4, 1, 8)
  println(set.getClass.getName)  //scala.collection.immutable.TreeSet
  println(set) //TreeSet(1, 2, 3, 4, 5, 6, 7, 8)

  import scala.collection.mutable.TreeSet

  val mSet = TreeSet(3,9)
  mSet += 5
  mSet += 1
  println(mSet)  //TreeSet(1, 3, 5, 9)
}
