package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for RunStepDetailsToolCallsObject_tool_calls_inner.
  * @param id The ID of the tool call object.
  * @param `type` The type of tool call. This is always going to be `code_interpreter` for this type of tool call.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class RunStepDetailsToolCallsObjectToolCallsInner(
  id: String,
  `type`: RunStepDetailsToolCallsObjectToolCallsInner.Type.Value,
  codeInterpreter: RunStepDetailsToolCallsCodeObjectCodeInterpreter,
  fileSearch: RunStepDetailsToolCallsFileSearchObjectFileSearch,
  function: RunStepDetailsToolCallsFunctionObjectFunction
)

object RunStepDetailsToolCallsObjectToolCallsInner {
  implicit lazy val runStepDetailsToolCallsObjectToolCallsInnerJsonFormat: Format[RunStepDetailsToolCallsObjectToolCallsInner] = Json.format[RunStepDetailsToolCallsObjectToolCallsInner]

  // noinspection TypeAnnotation
  object Type extends Enumeration {
    val CodeInterpreter = Value("code_interpreter")
    val FileSearch = Value("file_search")
    val Function = Value("function")

    type Type = Value
    implicit lazy val TypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

