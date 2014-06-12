package com.meetfp.examples.vantage

import org.scalatest._
import org.specs2.mutable._


/**
 * Examples of scala tutorials on http://meetfp.com/
 * Created by dengchunni
 */
object Calc {
  def sum(a: Int, b: Int) = a + b
}

class SumSuite extends FunSuite {
  def testSum() {
    assert(Calc.sum(1, 2) == 3)
  }

  test("The sum method should get correct sum total of two values") {
    assert(Calc.sum(1, 2) == 3)
  }
}

class SumSpec extends FlatSpec with Matchers {
  "The sum method" should "get the correct sum of two values" in {
    Calc.sum(1, 2) should be(3)
  }
}

class SumSpecs2 extends Specification {
  "The sum method" should {
    "get the correct sum of two values" in {
      Calc.sum(1, 2) must be_==(3)
    }
  }
}





