package model

import play.api.libs.json._

/**
  * Occurs when a [run](/docs/api-reference/runs/object) expires.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-26T05:22:02.282422614Z[Etc/UTC]", comments = "Generator version: 7.24.0")
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

