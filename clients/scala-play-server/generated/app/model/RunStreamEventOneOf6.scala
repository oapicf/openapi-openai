package model

import play.api.libs.json._

/**
  * Occurs when a [run](/docs/api-reference/runs/object) fails.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class RunStreamEventOneOf6(
  event: RunStreamEventOneOf6.Event.Value,
  data: RunObject
)

object RunStreamEventOneOf6 {
  implicit lazy val runStreamEventOneOf6JsonFormat: Format[RunStreamEventOneOf6] = Json.format[RunStreamEventOneOf6]

  // noinspection TypeAnnotation
  object Event extends Enumeration {
    val ThreadRunFailed = Value("thread.run.failed")

    type Event = Value
    implicit lazy val EventJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

