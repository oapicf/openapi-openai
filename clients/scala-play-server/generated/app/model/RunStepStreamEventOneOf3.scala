package model

import play.api.libs.json._

/**
  * Occurs when a [run step](/docs/api-reference/run-steps/step-object) is completed.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:38:29.809972473Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class RunStepStreamEventOneOf3(
  event: RunStepStreamEventOneOf3.Event.Value,
  data: RunStepObject
)

object RunStepStreamEventOneOf3 {
  implicit lazy val runStepStreamEventOneOf3JsonFormat: Format[RunStepStreamEventOneOf3] = Json.format[RunStepStreamEventOneOf3]

  // noinspection TypeAnnotation
  object Event extends Enumeration {
    val ThreadRunStepCompleted = Value("thread.run.step.completed")

    type Event = Value
    implicit lazy val EventJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

