package model

import play.api.libs.json._

/**
  * Occurs when a new [run](/docs/api-reference/runs/object) is created.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-03T11:15:39.331426426Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class RunStreamEventOneOf(
  event: RunStreamEventOneOf.Event.Value,
  data: RunObject
)

object RunStreamEventOneOf {
  implicit lazy val runStreamEventOneOfJsonFormat: Format[RunStreamEventOneOf] = Json.format[RunStreamEventOneOf]

  // noinspection TypeAnnotation
  object Event extends Enumeration {
    val ThreadRunCreated = Value("thread.run.created")

    type Event = Value
    implicit lazy val EventJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

