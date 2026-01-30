package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ModifyAssistantRequest_tool_resources_code_interpreter.
  * @param fileIds Overrides the list of [file](/docs/api-reference/files) IDs made available to the `code_interpreter` tool. There can be a maximum of 20 files associated with the tool. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class ModifyAssistantRequestToolResourcesCodeInterpreter(
  fileIds: Option[List[String]]
)

object ModifyAssistantRequestToolResourcesCodeInterpreter {
  implicit lazy val modifyAssistantRequestToolResourcesCodeInterpreterJsonFormat: Format[ModifyAssistantRequestToolResourcesCodeInterpreter] = Json.format[ModifyAssistantRequestToolResourcesCodeInterpreter]
}

