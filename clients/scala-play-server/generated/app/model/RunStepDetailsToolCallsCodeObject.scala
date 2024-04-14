package model

import play.api.libs.json._

/**
  * Details of the Code Interpreter tool call the run step was involved in.
  * @param id The ID of the tool call.
  * @param `type` The type of tool call. This is always going to be `code_interpreter` for this type of tool call.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-04-14T13:53:34.453725706Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class RunStepDetailsToolCallsCodeObject(
  id: String,
  `type`: RunStepDetailsToolCallsCodeObject.Type.Value,
  codeInterpreter: RunStepDetailsToolCallsCodeObjectCodeInterpreter
)

object RunStepDetailsToolCallsCodeObject {
  implicit lazy val runStepDetailsToolCallsCodeObjectJsonFormat: Format[RunStepDetailsToolCallsCodeObject] = Json.format[RunStepDetailsToolCallsCodeObject]

  // noinspection TypeAnnotation
  object Type extends Enumeration {
    val CodeInterpreter = Value("code_interpreter")

    type Type = Value
    implicit lazy val TypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

