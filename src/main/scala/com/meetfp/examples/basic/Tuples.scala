package com.meetfp.examples.basic

/**
 * Examples of scala tutorials on http://meetfp.com/
 * Created by dengchunni
 */
object Tuples extends App {
  val score = ("Jimmy", 90, 92 )

  def total(a: Int, b: Int) = a + b

  println("%s got %d in total".format(score._1, total(score._2, score._3)))

}

object UseTuple extends App {
  def findHighest(scores: Map[String,Int]) = {
    var max = 0
    var name = ""
    for((k, v) <- scores) {
      if(v > max) {
        max = v
        name = k
      }
    }
    (name, max)
  }

  val scores = Map("Jimmy" -> 90, "Abby" -> 92, "Ella" -> 88)
  val (champion, score) = findHighest(scores)
  println("The champion: %s, score: %d".format(champion, score))
}
