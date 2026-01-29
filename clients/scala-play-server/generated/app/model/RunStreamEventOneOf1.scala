package model

import play.api.libs.json._

/**
  * Occurs when a [run](/docs/api-reference/runs/object) moves to a `queued` status.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T10:48:27.489746113Z[Etc/UTC]", comments = "Generator version: 7.18.0")
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

