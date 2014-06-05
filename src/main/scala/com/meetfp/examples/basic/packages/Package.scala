
/**
 * Examples of scala tutorials on http://meetfp.com/
 * Created by dengchunni
 */
package outer {

class InOuter {
  val sOut = "I'm InOuter, and I am in the outer package"
}

package inner {

  class InInner {
    val sInner = "I'm InInner, and I am in the inner package"
  }

  object TestInInner {
    //Directly access from the outer package
    def test() {
      println("I'm in the inner package, but I can access InOuter class directly")
      val out = new InOuter
      println(out.sOut)
    }
  }

}

  object TestInOuter {
    //Cannot access the class from the nested package directly
    //but can access just by inner.InInner is OK, no need to say outer.inner.InInner
    def test() {
      println("I'm in the outer package, and I CANNOT access InInner class directly")
      val in = new inner.InInner
      println(in.sInner)
    }
  }

  object Test extends App {
    TestInOuter.test()
    inner.TestInInner.test()
  }
}
