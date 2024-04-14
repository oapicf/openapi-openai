package org.openapitools.server.model


/**
 * @param metadata Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.  for example: ''null''
*/
final case class ModifyMessageRequest (
  metadata: Option[Any] = None
)

