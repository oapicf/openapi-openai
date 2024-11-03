package model

import play.api.libs.json._

/**
  * Occurs when a [run](/docs/api-reference/runs/object) moves to a `cancelling` status.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-03T11:15:39.331426426Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class RunStreamEventOneOf6(
  event: RunStreamEventOneOf6.Event.Value,
  data: RunObject
)

object RunStreamEventOneOf6 {
  implicit lazy val runStreamEventOneOf6JsonFormat: Format[RunStreamEventOneOf6] = Json.format[RunStreamEventOneOf6]

  // noinspection TypeAnnotation
  object Event extends Enumeration {
    val ThreadRunCancelling = Value("thread.run.cancelling")

    type Event = Value
    implicit lazy val EventJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

