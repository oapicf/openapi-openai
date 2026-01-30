package model

import play.api.libs.json._

/**
  * Occurs when a [run step](/docs/api-reference/run-steps/step-object) expires.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class RunStepStreamEventOneOf6(
  event: RunStepStreamEventOneOf6.Event.Value,
  data: RunStepObject
)

object RunStepStreamEventOneOf6 {
  implicit lazy val runStepStreamEventOneOf6JsonFormat: Format[RunStepStreamEventOneOf6] = Json.format[RunStepStreamEventOneOf6]

  // noinspection TypeAnnotation
  object Event extends Enumeration {
    val ThreadRunStepExpired = Value("thread.run.step.expired")

    type Event = Value
    implicit lazy val EventJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

