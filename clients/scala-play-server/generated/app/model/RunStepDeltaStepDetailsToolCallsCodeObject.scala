package model

import play.api.libs.json._

/**
  * Details of the Code Interpreter tool call the run step was involved in.
  * @param index The index of the tool call in the tool calls array.
  * @param id The ID of the tool call.
  * @param `type` The type of tool call. This is always going to be `code_interpreter` for this type of tool call.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T10:48:27.489746113Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class RunStepDeltaStepDetailsToolCallsCodeObject(
  index: Int,
  id: Option[String],
  `type`: RunStepDeltaStepDetailsToolCallsCodeObject.Type.Value,
  codeInterpreter: Option[RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter]
)

object RunStepDeltaStepDetailsToolCallsCodeObject {
  implicit lazy val runStepDeltaStepDetailsToolCallsCodeObjectJsonFormat: Format[RunStepDeltaStepDetailsToolCallsCodeObject] = Json.format[RunStepDeltaStepDetailsToolCallsCodeObject]

  // noinspection TypeAnnotation
  object Type extends Enumeration {
    val CodeInterpreter = Value("code_interpreter")

    type Type = Value
    implicit lazy val TypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

