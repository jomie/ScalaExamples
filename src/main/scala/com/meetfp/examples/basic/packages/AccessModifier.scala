
/**
 * Examples of scala tutorials on http://meetfp.com/
 * Created by dengchunni
 */
package outer {

class Outer {
    private val privOuterStr = "I'm a private string in Outer"

    class Nested {
      private val privNestedStr = "I'm a private string in Nested"

      println(privOuterStr) //can access privNestedStr
    }

    //println(privNestedStr) //cannot access privNestedStr
  }

  package inner {

    class Inner {
      private val privateVal = "private can be accessed within the class"
      private[this] val privateThis = "private[this], can only access from same object"
      private[inner] val privateInner = "private inner, can access from the inner package"
      private[outer] val privateOuter = "private outer, can access from the outer package"
      protected[outer] val protectedOuter = "protected outer, can be accessed from the outer package, as well as its sub classes."

      def test() {
        val another = new Inner
        another.privateVal //OK
        //another.privateThis //Inaccessible
      }
    }

    object InInnerPackage {
      def test() {
        val inner1 = new Inner
        inner1.privateInner //OK
        //inner1.privateThis //Inaccessible
      }
    }

  }

  object InOuterPackage {
    def test() {
      val inner2 = new inner.Inner
      inner2.privateOuter     //OK
      inner2.protectedOuter   //OK
      //inner1.privateInner   //Inaccessible
      //inner1.privateThis    //Inaccessible
    }
  }

}
