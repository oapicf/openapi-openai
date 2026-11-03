package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CreateThreadAndRunRequest_tools_inner.
  * @param `type` The type of tool being defined: `code_interpreter`
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:38:29.809972473Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class CreateThreadAndRunRequestToolsInner(
  `type`: CreateThreadAndRunRequestToolsInner.Type.Value,
  fileSearch: Option[AssistantToolsFileSearchFileSearch],
  function: FunctionObject
)

object CreateThreadAndRunRequestToolsInner {
  implicit lazy val createThreadAndRunRequestToolsInnerJsonFormat: Format[CreateThreadAndRunRequestToolsInner] = Json.format[CreateThreadAndRunRequestToolsInner]

  // noinspection TypeAnnotation
  object Type extends Enumeration {
    val CodeInterpreter = Value("code_interpreter")
    val FileSearch = Value("file_search")
    val Function = Value("function")

    type Type = Value
    implicit lazy val TypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

