package model

import play.api.libs.json._

/**
  * Occurs when a [run](/docs/api-reference/runs/object) moves to a `requires_action` status.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-04-14T13:53:34.453725706Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class RunStreamEventOneOf3(
  event: RunStreamEventOneOf3.Event.Value,
  data: RunObject
)

object RunStreamEventOneOf3 {
  implicit lazy val runStreamEventOneOf3JsonFormat: Format[RunStreamEventOneOf3] = Json.format[RunStreamEventOneOf3]

  // noinspection TypeAnnotation
  object Event extends Enumeration {
    val ThreadRunRequiresAction = Value("thread.run.requires_action")

    type Event = Value
    implicit lazy val EventJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

