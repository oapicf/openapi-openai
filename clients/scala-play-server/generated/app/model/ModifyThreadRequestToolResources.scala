package model

import play.api.libs.json._

/**
  * A set of resources that are made available to the assistant's tools in this thread. The resources are specific to the type of tool. For example, the `code_interpreter` tool requires a list of file IDs, while the `file_search` tool requires a list of vector store IDs. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:38:29.809972473Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class ModifyThreadRequestToolResources(
  codeInterpreter: Option[CreateAssistantRequestToolResourcesCodeInterpreter],
  fileSearch: Option[ModifyThreadRequestToolResourcesFileSearch]
)

object ModifyThreadRequestToolResources {
  implicit lazy val modifyThreadRequestToolResourcesJsonFormat: Format[ModifyThreadRequestToolResources] = Json.format[ModifyThreadRequestToolResources]
}

