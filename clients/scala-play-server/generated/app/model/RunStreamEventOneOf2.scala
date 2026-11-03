package model

import play.api.libs.json._

/**
  * Occurs when a [run](/docs/api-reference/runs/object) moves to an `in_progress` status.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:38:29.809972473Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class RunStreamEventOneOf2(
  event: RunStreamEventOneOf2.Event.Value,
  data: RunObject
)

object RunStreamEventOneOf2 {
  implicit lazy val runStreamEventOneOf2JsonFormat: Format[RunStreamEventOneOf2] = Json.format[RunStreamEventOneOf2]

  // noinspection TypeAnnotation
  object Event extends Enumeration {
    val ThreadRunInProgress = Value("thread.run.in_progress")

    type Event = Value
    implicit lazy val EventJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

