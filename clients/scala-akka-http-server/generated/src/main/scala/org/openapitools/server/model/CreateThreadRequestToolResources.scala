package org.openapitools.server.model


/**
 * A set of resources that are made available to the assistant's tools in this thread. The resources are specific to the type of tool. For example, the `code_interpreter` tool requires a list of file IDs, while the `file_search` tool requires a list of vector store IDs. 
 *
 * @param codeInterpreter  for example: ''null''
 * @param fileSearch  for example: ''null''
*/
final case class CreateThreadRequestToolResources (
  codeInterpreter: Option[CreateAssistantRequestToolResourcesCodeInterpreter] = None,
  fileSearch: Option[CreateThreadRequestToolResourcesFileSearch] = None
)

