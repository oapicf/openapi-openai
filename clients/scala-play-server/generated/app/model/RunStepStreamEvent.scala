package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for RunStepStreamEvent.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-04-14T13:53:34.453725706Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class RunStepStreamEvent(
  event: RunStepStreamEvent.Event.Value,
  data: RunStepObject
)

object RunStepStreamEvent {
  implicit lazy val runStepStreamEventJsonFormat: Format[RunStepStreamEvent] = Json.format[RunStepStreamEvent]

  // noinspection TypeAnnotation
  object Event extends Enumeration {
    val ThreadRunStepExpired = Value("thread.run.step.expired")

    type Event = Value
    implicit lazy val EventJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

