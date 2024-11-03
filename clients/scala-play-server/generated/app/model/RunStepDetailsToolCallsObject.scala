package model

import play.api.libs.json._

/**
  * Details of the tool call.
  * @param `type` Always `tool_calls`.
  * @param toolCalls An array of tool calls the run step was involved in. These can be associated with one of three types of tools: `code_interpreter`, `retrieval`, or `function`. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-03T11:15:39.331426426Z[Etc/UTC]", comments = "Generator version: 7.9.0")
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

