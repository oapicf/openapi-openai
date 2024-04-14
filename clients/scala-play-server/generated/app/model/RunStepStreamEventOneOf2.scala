package model

import play.api.libs.json._

/**
  * Occurs when parts of a [run step](/docs/api-reference/runs/step-object) are being streamed.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-04-14T13:53:34.453725706Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class RunStepStreamEventOneOf2(
  event: RunStepStreamEventOneOf2.Event.Value,
  data: RunStepDeltaObject
)

object RunStepStreamEventOneOf2 {
  implicit lazy val runStepStreamEventOneOf2JsonFormat: Format[RunStepStreamEventOneOf2] = Json.format[RunStepStreamEventOneOf2]

  // noinspection TypeAnnotation
  object Event extends Enumeration {
    val ThreadRunStepDelta = Value("thread.run.step.delta")

    type Event = Value
    implicit lazy val EventJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

