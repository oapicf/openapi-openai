package model

import play.api.libs.json._

/**
  * The Code Interpreter tool call definition.
  * @param input The input to the Code Interpreter tool call.
  * @param outputs The outputs from the Code Interpreter tool call. Code Interpreter can output one or more items, including text (`logs`) or images (`image`). Each of these are represented by a different object type.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:38:29.809972473Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class RunStepDetailsToolCallsCodeObjectCodeInterpreter(
  input: String,
  outputs: List[RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner]
)

object RunStepDetailsToolCallsCodeObjectCodeInterpreter {
  implicit lazy val runStepDetailsToolCallsCodeObjectCodeInterpreterJsonFormat: Format[RunStepDetailsToolCallsCodeObjectCodeInterpreter] = Json.format[RunStepDetailsToolCallsCodeObjectCodeInterpreter]
}

