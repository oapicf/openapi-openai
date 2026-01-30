package model

import play.api.libs.json._

/**
  * Occurs when a [run](/docs/api-reference/runs/object) moves to a `cancelling` status.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class RunStreamEventOneOf7(
  event: RunStreamEventOneOf7.Event.Value,
  data: RunObject
)

object RunStreamEventOneOf7 {
  implicit lazy val runStreamEventOneOf7JsonFormat: Format[RunStreamEventOneOf7] = Json.format[RunStreamEventOneOf7]

  // noinspection TypeAnnotation
  object Event extends Enumeration {
    val ThreadRunCancelling = Value("thread.run.cancelling")

    type Event = Value
    implicit lazy val EventJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

