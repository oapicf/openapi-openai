package model

import play.api.libs.json._

/**
  * Occurs when a [run](/docs/api-reference/runs/object) is completed.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-04-14T13:53:34.453725706Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class RunStreamEventOneOf4(
  event: RunStreamEventOneOf4.Event.Value,
  data: RunObject
)

object RunStreamEventOneOf4 {
  implicit lazy val runStreamEventOneOf4JsonFormat: Format[RunStreamEventOneOf4] = Json.format[RunStreamEventOneOf4]

  // noinspection TypeAnnotation
  object Event extends Enumeration {
    val ThreadRunCompleted = Value("thread.run.completed")

    type Event = Value
    implicit lazy val EventJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

