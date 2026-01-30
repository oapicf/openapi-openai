package model

import play.api.libs.json._

/**
  * Occurs when an [error](/docs/guides/error-codes#api-errors) occurs. This can happen due to an internal server error or a timeout.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class ErrorEvent(
  event: ErrorEvent.Event.Value,
  data: Error
)

object ErrorEvent {
  implicit lazy val errorEventJsonFormat: Format[ErrorEvent] = Json.format[ErrorEvent]

  // noinspection TypeAnnotation
  object Event extends Enumeration {
    val Error = Value("error")

    type Event = Value
    implicit lazy val EventJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

