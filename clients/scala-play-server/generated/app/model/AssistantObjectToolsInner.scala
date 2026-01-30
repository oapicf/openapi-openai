package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AssistantObject_tools_inner.
  * @param `type` The type of tool being defined: `code_interpreter`
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class AssistantObjectToolsInner(
  `type`: AssistantObjectToolsInner.Type.Value,
  fileSearch: Option[AssistantToolsFileSearchFileSearch],
  function: FunctionObject
)

object AssistantObjectToolsInner {
  implicit lazy val assistantObjectToolsInnerJsonFormat: Format[AssistantObjectToolsInner] = Json.format[AssistantObjectToolsInner]

  // noinspection TypeAnnotation
  object Type extends Enumeration {
    val CodeInterpreter = Value("code_interpreter")
    val FileSearch = Value("file_search")
    val Function = Value("function")

    type Type = Value
    implicit lazy val TypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

