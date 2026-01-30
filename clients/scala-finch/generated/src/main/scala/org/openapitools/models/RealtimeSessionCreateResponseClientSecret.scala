package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Ephemeral key returned by the API.
 * @param value Ephemeral key usable in client environments to authenticate connections to the Realtime API. Use this in client-side environments rather than a standard API token, which should only be used server-side. 
 * @param expiresUnderscoreat Timestamp for when the token expires. Currently, all tokens expire after one minute. 
 */
case class RealtimeSessionCreateResponseClientSecret(value: Option[String],
                expiresUnderscoreat: Option[Int]
                )

object RealtimeSessionCreateResponseClientSecret {
    /**
     * Creates the codec for converting RealtimeSessionCreateResponseClientSecret from and to JSON.
     */
    implicit val decoder: Decoder[RealtimeSessionCreateResponseClientSecret] = deriveDecoder
    implicit val encoder: ObjectEncoder[RealtimeSessionCreateResponseClientSecret] = deriveEncoder
}
