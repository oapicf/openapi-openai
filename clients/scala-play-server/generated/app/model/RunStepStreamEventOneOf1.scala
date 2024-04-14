package model

import play.api.libs.json._

/**
  * Occurs when a [run step](/docs/api-reference/runs/step-object) moves to an `in_progress` state.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-04-14T13:53:34.453725706Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class RunStepStreamEventOneOf1(
  event: RunStepStreamEventOneOf1.Event.Value,
  data: RunStepObject
)

object RunStepStreamEventOneOf1 {
  implicit lazy val runStepStreamEventOneOf1JsonFormat: Format[RunStepStreamEventOneOf1] = Json.format[RunStepStreamEventOneOf1]

  // noinspection TypeAnnotation
  object Event extends Enumeration {
    val ThreadRunStepInProgress = Value("thread.run.step.in_progress")

    type Event = Value
    implicit lazy val EventJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

