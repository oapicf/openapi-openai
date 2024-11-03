package model

import play.api.libs.json._

/**
  * Text output from the Code Interpreter tool call as part of a run step.
  * @param index The index of the output in the outputs array.
  * @param `type` Always `logs`.
  * @param logs The text output from the Code Interpreter tool call.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-03T11:15:39.331426426Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject(
  index: Int,
  `type`: RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject.Type.Value,
  logs: Option[String]
)

object RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject {
  implicit lazy val runStepDeltaStepDetailsToolCallsCodeOutputLogsObjectJsonFormat: Format[RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject] = Json.format[RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject]

  // noinspection TypeAnnotation
  object Type extends Enumeration {
    val Logs = Value("logs")

    type Type = Value
    implicit lazy val TypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

