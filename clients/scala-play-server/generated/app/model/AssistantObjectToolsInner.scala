package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AssistantObject_tools_inner.
  * @param `type` The type of tool being defined: `code_interpreter`
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-04-14T13:53:34.453725706Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class AssistantObjectToolsInner(
  `type`: AssistantObjectToolsInner.Type.Value,
  function: FunctionObject
)

object AssistantObjectToolsInner {
  implicit lazy val assistantObjectToolsInnerJsonFormat: Format[AssistantObjectToolsInner] = Json.format[AssistantObjectToolsInner]

  // noinspection TypeAnnotation
  object Type extends Enumeration {
    val CodeInterpreter = Value("code_interpreter")
    val Retrieval = Value("retrieval")
    val Function = Value("function")

    type Type = Value
    implicit lazy val TypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

