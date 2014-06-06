package com.meetfp.examples.vantage

/**
 * Examples of scala tutorials on http://meetfp.com/
 * Created by dengchunni
 */
object Traits extends App {
  trait Flyable {
    val height: Int
    def fly = {
      println(s"I can fly at the height of $height feet.")
    }
  }

  class Balloon extends Flyable {
    val height = 20

    override def toString = "Balloon: "
  }

  abstract class Bird {
    // properties and methods with the type Bird
  }

  class Pigeon extends Bird with Flyable {
    //inherit properties and methods from Bird
    val height = 300
    override def toString = "Pigeon: "
  }

  abstract class AirCraft {
    // properties and methods with the type AirCraft
  }

  class Boeing777 extends AirCraft with Flyable {
    //inherit properties and methods from AirCraft
    val height = 30000
    override def fly = {
      super.fly
      println("I can fly even higher!")
    }

    override def toString = "Boeing 777: "
  }

  val balloon = new Balloon
  print(balloon)
  balloon.fly

  val pigeon = new Pigeon
  print(pigeon)
  pigeon.fly

  val boeing = new Boeing777
  print(boeing)
  boeing.fly

}
