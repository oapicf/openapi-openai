package org.openapitools.server.model


/**
 * = Vector store expiration policy =
 *
 * The expiration policy for a vector store.
 *
 * @param anchor Anchor timestamp after which the expiration policy applies. Supported anchors: `last_active_at`. for example: ''null''
 * @param days The number of days after the anchor time that the vector store will expire. for example: ''null''
*/
final case class VectorStoreExpirationAfter (
  anchor: String,
  days: Int
)

