package model

import play.api.libs.json._

/**
  * The Code Interpreter tool call definition.
  * @param input The input to the Code Interpreter tool call.
  * @param outputs The outputs from the Code Interpreter tool call. Code Interpreter can output one or more items, including text (`logs`) or images (`image`). Each of these are represented by a different object type.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-04-14T13:53:34.453725706Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class RunStepDetailsToolCallsCodeObjectCodeInterpreter(
  input: String,
  outputs: List[RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner]
)

object RunStepDetailsToolCallsCodeObjectCodeInterpreter {
  implicit lazy val runStepDetailsToolCallsCodeObjectCodeInterpreterJsonFormat: Format[RunStepDetailsToolCallsCodeObjectCodeInterpreter] = Json.format[RunStepDetailsToolCallsCodeObjectCodeInterpreter]
}

