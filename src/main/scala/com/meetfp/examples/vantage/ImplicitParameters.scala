package com.meetfp.examples.vantage

/**
 * Examples of scala tutorials on http://meetfp.com/
 * Created by dengchunni
 */
object ImplicitParameters extends App {
  abstract class Logger {def log(s: String)}
  class FileLogger extends Logger {
    def log(s: String) {println("Log in file: " + s)}
  }
  class StdoutLogger extends Logger {
    def log(s: String) {println("Stdout: " + s)}
  }

  def Add(a: Int, b: Int)(implicit logger: Logger) {
    val sum = a + b
    logger.log("%d + %d = %d".format(a, b, sum ))
  }

  implicit val log = new FileLogger

  Add(1,2)
  Add(2,3)(new StdoutLogger) //you may do it explicitly
}
