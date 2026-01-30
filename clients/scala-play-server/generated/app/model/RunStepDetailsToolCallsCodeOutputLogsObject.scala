package model

import play.api.libs.json._

/**
  * Text output from the Code Interpreter tool call as part of a run step.
  * @param `type` Always `logs`.
  * @param logs The text output from the Code Interpreter tool call.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class RunStepDetailsToolCallsCodeOutputLogsObject(
  `type`: RunStepDetailsToolCallsCodeOutputLogsObject.Type.Value,
  logs: String
)

object RunStepDetailsToolCallsCodeOutputLogsObject {
  implicit lazy val runStepDetailsToolCallsCodeOutputLogsObjectJsonFormat: Format[RunStepDetailsToolCallsCodeOutputLogsObject] = Json.format[RunStepDetailsToolCallsCodeOutputLogsObject]

  // noinspection TypeAnnotation
  object Type extends Enumeration {
    val Logs = Value("logs")

    type Type = Value
    implicit lazy val TypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

