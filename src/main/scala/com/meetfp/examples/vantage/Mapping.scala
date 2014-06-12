package com.meetfp.examples.vantage

/**
 * Examples of scala tutorials on http://meetfp.com/
 * Created by dengchunni
 */
object Mapping extends App {
  val arr1 = Array(1, 2, 3).map(_ * 3)
  val arr2 = Array(1, 2, 3).map(x => x * 3)

  val list = List(83, 91, 56, 78).map(i => i match {
    case s if (s > 100 || s < 0) => 'N'
    case s if s >= 85 => 'A'
    case s if (s >= 75 && s < 85) => 'B'
    case s if (s >= 60 && s < 75) => 'C'
    case s if (s >= 40 && s < 60) => 'D'
    case s if (s < 40) => 'E'
  })
  println(list)


  val arr = List(List(1, 2), List(3, 5), List(4, 9, 10))
  val retMap = arr.map(_.map(_ * 3))
  val retFlat = arr.flatMap(_.map(_ * 3))
  println("map: " + retMap)
  println("flatMap: " + retFlat)

  val map = Map(("China", "Beijing"), ("Switzerland", "Berne"))
    .map(a => s"${a._2} is the capital of ${a._1}")
  println(map)

}
