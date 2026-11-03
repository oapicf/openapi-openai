package model

import play.api.libs.json._

/**
  * Occurs when a [run](/docs/api-reference/runs/object) ends with status `incomplete`.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:38:29.809972473Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class RunStreamEventOneOf5(
  event: RunStreamEventOneOf5.Event.Value,
  data: RunObject
)

object RunStreamEventOneOf5 {
  implicit lazy val runStreamEventOneOf5JsonFormat: Format[RunStreamEventOneOf5] = Json.format[RunStreamEventOneOf5]

  // noinspection TypeAnnotation
  object Event extends Enumeration {
    val ThreadRunIncomplete = Value("thread.run.incomplete")

    type Event = Value
    implicit lazy val EventJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

