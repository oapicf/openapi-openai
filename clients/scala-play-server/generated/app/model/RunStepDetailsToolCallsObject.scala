package model

import play.api.libs.json._

/**
  * Details of the tool call.
  * @param `type` Always `tool_calls`.
  * @param toolCalls An array of tool calls the run step was involved in. These can be associated with one of three types of tools: `code_interpreter`, `file_search`, or `function`. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class RunStepDetailsToolCallsObject(
  `type`: RunStepDetailsToolCallsObject.Type.Value,
  toolCalls: List[RunStepDetailsToolCallsObjectToolCallsInner]
)

object RunStepDetailsToolCallsObject {
  implicit lazy val runStepDetailsToolCallsObjectJsonFormat: Format[RunStepDetailsToolCallsObject] = Json.format[RunStepDetailsToolCallsObject]

  // noinspection TypeAnnotation
  object Type extends Enumeration {
    val ToolCalls = Value("tool_calls")

    type Type = Value
    implicit lazy val TypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

