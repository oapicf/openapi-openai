package model

import play.api.libs.json._

/**
  * Occurs when a [run step](/docs/api-reference/runs/step-object) fails.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T10:48:27.489746113Z[Etc/UTC]", comments = "Generator version: 7.18.0")
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

