package org.openapitools.server.model


/**
 * @param model  for example: ''null''
 * @param name The name of the assistant. The maximum length is 256 characters.  for example: ''null''
 * @param description The description of the assistant. The maximum length is 512 characters.  for example: ''null''
 * @param instructions The system instructions that the assistant uses. The maximum length is 256,000 characters.  for example: ''null''
 * @param tools A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types `code_interpreter`, `retrieval`, or `function`.  for example: ''null''
 * @param fileIds A list of [File](/docs/api-reference/files) IDs attached to this assistant. There can be a maximum of 20 files attached to the assistant. Files are ordered by their creation date in ascending order. If a file was previously attached to the list but does not show up in the list, it will be deleted from the assistant.  for example: ''null''
 * @param metadata Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.  for example: ''null''
*/
final case class ModifyAssistantRequest (
  model: Option[String] = None,
  name: Option[String] = None,
  description: Option[String] = None,
  instructions: Option[String] = None,
  tools: Option[Seq[AssistantObjectToolsInner]] = None,
  fileIds: Option[Seq[String]] = None,
  metadata: Option[Any] = None
)

