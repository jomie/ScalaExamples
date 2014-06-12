package com.meetfp.examples.vantage

/**
 * Examples of scala tutorials on http://meetfp.com/
 * Created by dengchunni
 */
object Zip extends App {
  val dept = List("Math", "Chem", "Phys", "Art")
  val stud = Array(120, 60, 80)
  val res = dept zip stud
  println(res)
}

object ZipWithIndex extends App {
  val dept = List("Math", "Chem", "Phys", "Art")
  val res = dept.zipWithIndex
  println(res)
}

object ZipAll extends App {
  val dept = List("Math", "Chem", "Phys", "Art")
  val stud = Array(120, 60, 80)
  val res = dept zipAll(stud, "", 0)
  println(res)
}

object Unzip extends App {
  val list = List(("Math", 120), ("Chem", 60), ("Phys", 80))
  val res = list.unzip
  println(res)

  val list3 = List(("Math", 120, 1956), ("Chem", 60, 1958), ("Phys", 80, 1957))
  val res3 = list3.unzip3
  println(res3)
}
