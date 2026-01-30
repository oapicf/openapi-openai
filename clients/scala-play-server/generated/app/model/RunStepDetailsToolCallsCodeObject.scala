package model

import play.api.libs.json._

/**
  * Details of the Code Interpreter tool call the run step was involved in.
  * @param id The ID of the tool call.
  * @param `type` The type of tool call. This is always going to be `code_interpreter` for this type of tool call.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
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

