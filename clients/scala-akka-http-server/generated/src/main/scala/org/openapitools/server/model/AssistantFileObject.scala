package org.openapitools.server.model


/**
 * = Assistant files =
 *
 * A list of [Files](/docs/api-reference/files) attached to an `assistant`.
 *
 * @param id The identifier, which can be referenced in API endpoints. for example: ''null''
 * @param `object` The object type, which is always `assistant.file`. for example: ''null''
 * @param createdAt The Unix timestamp (in seconds) for when the assistant file was created. for example: ''null''
 * @param assistantId The assistant ID that the file is attached to. for example: ''null''
*/
final case class AssistantFileObject (
  id: String,
  `object`: String,
  createdAt: Int,
  assistantId: String
)

