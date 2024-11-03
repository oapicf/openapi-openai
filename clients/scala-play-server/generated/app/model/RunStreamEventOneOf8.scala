package model

import play.api.libs.json._

/**
  * Occurs when a [run](/docs/api-reference/runs/object) expires.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-03T11:15:39.331426426Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class RunStreamEventOneOf8(
  event: RunStreamEventOneOf8.Event.Value,
  data: RunObject
)

object RunStreamEventOneOf8 {
  implicit lazy val runStreamEventOneOf8JsonFormat: Format[RunStreamEventOneOf8] = Json.format[RunStreamEventOneOf8]

  // noinspection TypeAnnotation
  object Event extends Enumeration {
    val ThreadRunExpired = Value("thread.run.expired")

    type Event = Value
    implicit lazy val EventJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

