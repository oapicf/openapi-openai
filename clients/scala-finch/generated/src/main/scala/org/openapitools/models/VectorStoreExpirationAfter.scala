package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * The expiration policy for a vector store.
 * @param anchor Anchor timestamp after which the expiration policy applies. Supported anchors: `last_active_at`.
 * @param days The number of days after the anchor time that the vector store will expire.
 */
case class VectorStoreExpirationAfter(anchor: String,
                days: Int
                )

object VectorStoreExpirationAfter {
    /**
     * Creates the codec for converting VectorStoreExpirationAfter from and to JSON.
     */
    implicit val decoder: Decoder[VectorStoreExpirationAfter] = deriveDecoder
    implicit val encoder: ObjectEncoder[VectorStoreExpirationAfter] = deriveEncoder
}
