package org.openapitools.server.model


/**
 * = Thread =
 *
 * Represents a thread that contains [messages](/docs/api-reference/messages).
 *
 * @param id The identifier, which can be referenced in API endpoints. for example: ''null''
 * @param `object` The object type, which is always `thread`. for example: ''null''
 * @param createdAt The Unix timestamp (in seconds) for when the thread was created. for example: ''null''
 * @param toolResources  for example: ''null''
 * @param metadata Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  for example: ''null''
*/
final case class ThreadObject (
  id: String,
  `object`: String,
  createdAt: Int,
  toolResources: ModifyThreadRequestToolResources,
  metadata: Any
)

