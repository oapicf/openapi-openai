package model

import play.api.libs.json._

/**
  * Occurs when a [run step](/docs/api-reference/run-steps/step-object) fails.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class RunStepStreamEventOneOf4(
  event: RunStepStreamEventOneOf4.Event.Value,
  data: RunStepObject
)

object RunStepStreamEventOneOf4 {
  implicit lazy val runStepStreamEventOneOf4JsonFormat: Format[RunStepStreamEventOneOf4] = Json.format[RunStepStreamEventOneOf4]

  // noinspection TypeAnnotation
  object Event extends Enumeration {
    val ThreadRunStepFailed = Value("thread.run.step.failed")

    type Event = Value
    implicit lazy val EventJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

