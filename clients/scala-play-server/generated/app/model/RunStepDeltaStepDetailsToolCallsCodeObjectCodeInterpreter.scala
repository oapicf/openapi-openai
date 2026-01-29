package model

import play.api.libs.json._

/**
  * The Code Interpreter tool call definition.
  * @param input The input to the Code Interpreter tool call.
  * @param outputs The outputs from the Code Interpreter tool call. Code Interpreter can output one or more items, including text (`logs`) or images (`image`). Each of these are represented by a different object type.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T10:48:27.489746113Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter(
  input: Option[String],
  outputs: Option[List[RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner]]
)

object RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter {
  implicit lazy val runStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterJsonFormat: Format[RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter] = Json.format[RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter]
}

