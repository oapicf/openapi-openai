package model

import play.api.libs.json._

/**
  * Occurs when a [run](/docs/api-reference/runs/object) expires.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:38:29.809972473Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class RunStreamEventOneOf9(
  event: RunStreamEventOneOf9.Event.Value,
  data: RunObject
)

object RunStreamEventOneOf9 {
  implicit lazy val runStreamEventOneOf9JsonFormat: Format[RunStreamEventOneOf9] = Json.format[RunStreamEventOneOf9]

  // noinspection TypeAnnotation
  object Event extends Enumeration {
    val ThreadRunExpired = Value("thread.run.expired")

    type Event = Value
    implicit lazy val EventJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

