package model

import play.api.libs.json._

/**
  * Occurs when a [run step](/docs/api-reference/run-steps/step-object) is cancelled.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class RunStepStreamEventOneOf5(
  event: RunStepStreamEventOneOf5.Event.Value,
  data: RunStepObject
)

object RunStepStreamEventOneOf5 {
  implicit lazy val runStepStreamEventOneOf5JsonFormat: Format[RunStepStreamEventOneOf5] = Json.format[RunStepStreamEventOneOf5]

  // noinspection TypeAnnotation
  object Event extends Enumeration {
    val ThreadRunStepCancelled = Value("thread.run.step.cancelled")

    type Event = Value
    implicit lazy val EventJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

