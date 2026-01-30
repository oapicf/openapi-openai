package org.openapitools.server.model


/**
 * @param fileIds A list of [file](/docs/api-reference/files) IDs made available to the `code_interpreter` tool. There can be a maximum of 20 files associated with the tool.  for example: ''null''
*/
final case class CreateAssistantRequestToolResourcesCodeInterpreter (
  fileIds: Option[Seq[String]] = None
)

