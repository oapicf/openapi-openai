package model

import play.api.libs.json._

/**
  * The Code Interpreter tool call definition.
  * @param input The input to the Code Interpreter tool call.
  * @param outputs The outputs from the Code Interpreter tool call. Code Interpreter can output one or more items, including text (`logs`) or images (`image`). Each of these are represented by a different object type.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-03T11:15:39.331426426Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter(
  input: Option[String],
  outputs: Option[List[RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner]]
)

object RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter {
  implicit lazy val runStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterJsonFormat: Format[RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter] = Json.format[RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter]
}

