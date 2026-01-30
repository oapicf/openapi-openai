package model

import play.api.libs.json._

/**
  * A set of resources that are made available to the assistant's tools in this thread. The resources are specific to the type of tool. For example, the `code_interpreter` tool requires a list of file IDs, while the `file_search` tool requires a list of vector store IDs. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CreateThreadRequestToolResources(
  codeInterpreter: Option[CreateAssistantRequestToolResourcesCodeInterpreter],
  fileSearch: Option[CreateThreadRequestToolResourcesFileSearch]
)

object CreateThreadRequestToolResources {
  implicit lazy val createThreadRequestToolResourcesJsonFormat: Format[CreateThreadRequestToolResources] = Json.format[CreateThreadRequestToolResources]
}

