package model

import play.api.libs.json._

/**
  * Occurs when a [run step](/docs/api-reference/run-steps/step-object) is created.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:38:29.809972473Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class RunStepStreamEventOneOf(
  event: RunStepStreamEventOneOf.Event.Value,
  data: RunStepObject
)

object RunStepStreamEventOneOf {
  implicit lazy val runStepStreamEventOneOfJsonFormat: Format[RunStepStreamEventOneOf] = Json.format[RunStepStreamEventOneOf]

  // noinspection TypeAnnotation
  object Event extends Enumeration {
    val ThreadRunStepCreated = Value("thread.run.step.created")

    type Event = Value
    implicit lazy val EventJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

