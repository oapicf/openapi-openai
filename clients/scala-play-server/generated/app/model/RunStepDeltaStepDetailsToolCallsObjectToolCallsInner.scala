package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner.
  * @param index The index of the tool call in the tool calls array.
  * @param id The ID of the tool call object.
  * @param `type` The type of tool call. This is always going to be `code_interpreter` for this type of tool call.
  * @param fileSearch For now, this is always going to be an empty object.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class RunStepDeltaStepDetailsToolCallsObjectToolCallsInner(
  index: Int,
  id: Option[String],
  `type`: RunStepDeltaStepDetailsToolCallsObjectToolCallsInner.Type.Value,
  codeInterpreter: Option[RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter],
  fileSearch: JsObject,
  function: Option[RunStepDeltaStepDetailsToolCallsFunctionObjectFunction]
)

object RunStepDeltaStepDetailsToolCallsObjectToolCallsInner {
  implicit lazy val runStepDeltaStepDetailsToolCallsObjectToolCallsInnerJsonFormat: Format[RunStepDeltaStepDetailsToolCallsObjectToolCallsInner] = Json.format[RunStepDeltaStepDetailsToolCallsObjectToolCallsInner]

  // noinspection TypeAnnotation
  object Type extends Enumeration {
    val CodeInterpreter = Value("code_interpreter")
    val FileSearch = Value("file_search")
    val Function = Value("function")

    type Type = Value
    implicit lazy val TypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

