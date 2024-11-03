package model

import play.api.libs.json._

/**
  * Occurs when a [run](/docs/api-reference/runs/object) moves to a `queued` status.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-03T11:15:39.331426426Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class RunStreamEventOneOf1(
  event: RunStreamEventOneOf1.Event.Value,
  data: RunObject
)

object RunStreamEventOneOf1 {
  implicit lazy val runStreamEventOneOf1JsonFormat: Format[RunStreamEventOneOf1] = Json.format[RunStreamEventOneOf1]

  // noinspection TypeAnnotation
  object Event extends Enumeration {
    val ThreadRunQueued = Value("thread.run.queued")

    type Event = Value
    implicit lazy val EventJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

