package com.meetfp.examples.basic

/**
 * Examples of scala tutorials on http://meetfp.com/
 * Created by dengchunni
 */
object Classes extends App {
  class ScoreCalculator {
    private var total, count = 0

    def report(score: Int) {
      total += score
      count += 1
    }

    def score = if (count == 0) 0 else total / count
  }

  val sc = new ScoreCalculator()
  sc.report(80)
  sc.report(90)
  sc.report(92)
  sc.report(86)

  println("The average score is " + sc.score)

}

object ClassWithParameter extends App {
  class ScoreCalculator(athlete: String) {
    private var total, count = 0

    println("This is in the primary constructor")

    def report(score: Int) {
      total += score
      count += 1
    }

    def score = if (count == 0) 0 else total / count

    override def toString() = athlete + "'s score is " + score
  }

  val sc = new ScoreCalculator("Yao")
  println("Object created, and now you can use it.")
  sc.report(80)
  sc.report(90)
  println(sc)
}

object AuxiliaryConstructor extends App {
  class ScoreCalculator {
    var athlete = ""
    var degreeOfDifficulty = 0.0

    def this(athlete: String) {
      this()       //Call primary constructor
      this.athlete = athlete
    }

    def this(athlete: String, degreeOfDifficulty: Double) {
      this(athlete)   //Call another auxiliary constructor
      this.degreeOfDifficulty = degreeOfDifficulty
    }

    override def toString = "Athlete: " + athlete + ", degree of difficulty: " + degreeOfDifficulty
  }

  val sc1 = new ScoreCalculator("Gao Min")
  sc1.degreeOfDifficulty = 3.7
  println(sc1)

  val sc2 = new ScoreCalculator("Fu Mingxia", 3.5)
  println(sc2)
}
