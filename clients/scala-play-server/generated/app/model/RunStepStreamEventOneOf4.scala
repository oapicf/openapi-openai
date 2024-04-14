package model

import play.api.libs.json._

/**
  * Occurs when a [run step](/docs/api-reference/runs/step-object) fails.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-04-14T13:53:34.453725706Z[Etc/UTC]", comments = "Generator version: 7.4.0")
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

