package components

import japgolly.scalajs.react.component.Scala.{Component, Unmounted}
import japgolly.scalajs.react.{Callback, CtorType, ScalaComponent, ScalaFnComponent}
import japgolly.scalajs.react.vdom.all._

object Square {
  case class Props(value: String, onClick: Callback)

  case class State(displayed: Boolean)

  val component: Component[Props, State, Unit, CtorType.Props] = ScalaComponent
    .builder[Props]("Square")
    .initialState(State(displayed = false))
    .render_P(props =>
      div(
        cls := "square",
        button(
          onClick --> props.onClick,
          s"test: ${props.value}"
        )
      )
    )
    .build

  def apply(value: Option[String], onClick: Callback): Unmounted[Props, State, Unit] = component(
    Props(
      value.getOrElse(""),
      onClick
    )
  )
}