package org.openapitools.server.model


/**
 * @param name The name of the vector store. for example: ''null''
 * @param expiresAfter  for example: ''null''
 * @param metadata Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  for example: ''null''
*/
final case class UpdateVectorStoreRequest (
  name: Option[String] = None,
  expiresAfter: Option[VectorStoreExpirationAfter] = None,
  metadata: Option[Any] = None
)

