import org.scalajs.dom._

object Main {
  def main(args: Array[String]): Unit = {
    window.onload = _ => {
      document.getElementById("app-container").append("Hello Scala.js!")
    }
  }
}