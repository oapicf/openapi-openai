package model

import play.api.libs.json._

/**
  * Occurs when a [run](/docs/api-reference/runs/object) is cancelled.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T10:48:27.489746113Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class RunStreamEventOneOf7(
  event: RunStreamEventOneOf7.Event.Value,
  data: RunObject
)

object RunStreamEventOneOf7 {
  implicit lazy val runStreamEventOneOf7JsonFormat: Format[RunStreamEventOneOf7] = Json.format[RunStreamEventOneOf7]

  // noinspection TypeAnnotation
  object Event extends Enumeration {
    val ThreadRunCancelled = Value("thread.run.cancelled")

    type Event = Value
    implicit lazy val EventJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

