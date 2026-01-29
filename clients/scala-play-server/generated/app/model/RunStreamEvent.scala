package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for RunStreamEvent.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T10:48:27.489746113Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class RunStreamEvent(
  event: RunStreamEvent.Event.Value,
  data: RunObject
)

object RunStreamEvent {
  implicit lazy val runStreamEventJsonFormat: Format[RunStreamEvent] = Json.format[RunStreamEvent]

  // noinspection TypeAnnotation
  object Event extends Enumeration {
    val ThreadRunExpired = Value("thread.run.expired")

    type Event = Value
    implicit lazy val EventJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

