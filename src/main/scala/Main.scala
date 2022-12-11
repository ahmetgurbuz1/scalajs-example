import org.scalajs.dom._
import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.all.div
import components.Square

object Main {
  def main(args: Array[String]): Unit = {
    window.onload = _ => {
      div(
        Square(
          Option("1"),
          Callback {
            println("hello")
          }
        ),
        Square(
          Option("2"),
          Callback {
            println("hello")
          }
        )
      ).renderIntoDOM(document.getElementById("root"))
    }
  }
}