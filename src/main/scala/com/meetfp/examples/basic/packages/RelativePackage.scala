
/**
 * Examples of scala tutorials on http://meetfp.com/
 * Created by dengchunni
 */
package starter {
  class Runner {
    override def toString = "I'm in the root starter package"
  }
}

package level1 {
  package starter {
    class Runner {
      override def toString = "I'm in the level1 starter package"
    }
  }
  package level2 {
    package starter {

    class Runner {
      override def toString = "I'm in the level2 starter package"
    }

    }
  }

  object TestRunner extends App {
    val runner1 = new starter.Runner  //level1
    println(runner1)
    val runner2 = new level2.starter.Runner
    println(runner2)
    val runner3 = new _root_.starter.Runner
    println(runner3)
  }
}
