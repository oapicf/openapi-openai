package model

import play.api.libs.json._

/**
  * Occurs when a [run](/docs/api-reference/runs/object) fails.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-04-14T13:53:34.453725706Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class RunStreamEventOneOf5(
  event: RunStreamEventOneOf5.Event.Value,
  data: RunObject
)

object RunStreamEventOneOf5 {
  implicit lazy val runStreamEventOneOf5JsonFormat: Format[RunStreamEventOneOf5] = Json.format[RunStreamEventOneOf5]

  // noinspection TypeAnnotation
  object Event extends Enumeration {
    val ThreadRunFailed = Value("thread.run.failed")

    type Event = Value
    implicit lazy val EventJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

