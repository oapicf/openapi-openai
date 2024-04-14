package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for RunStepDetailsToolCallsObject_tool_calls_inner.
  * @param id The ID of the tool call object.
  * @param `type` The type of tool call. This is always going to be `code_interpreter` for this type of tool call.
  * @param retrieval For now, this is always going to be an empty object.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-04-14T13:53:34.453725706Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class RunStepDetailsToolCallsObjectToolCallsInner(
  id: String,
  `type`: RunStepDetailsToolCallsObjectToolCallsInner.Type.Value,
  codeInterpreter: RunStepDetailsToolCallsCodeObjectCodeInterpreter,
  retrieval: JsObject,
  function: RunStepDetailsToolCallsFunctionObjectFunction
)

object RunStepDetailsToolCallsObjectToolCallsInner {
  implicit lazy val runStepDetailsToolCallsObjectToolCallsInnerJsonFormat: Format[RunStepDetailsToolCallsObjectToolCallsInner] = Json.format[RunStepDetailsToolCallsObjectToolCallsInner]

  // noinspection TypeAnnotation
  object Type extends Enumeration {
    val CodeInterpreter = Value("code_interpreter")
    val Retrieval = Value("retrieval")
    val Function = Value("function")

    type Type = Value
    implicit lazy val TypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

