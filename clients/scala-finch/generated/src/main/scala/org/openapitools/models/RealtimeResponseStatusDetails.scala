package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.RealtimeResponseStatusDetailsError

/**
 * Additional details about the status.
 * @param _type The type of error that caused the response to fail, corresponding  with the `status` field (`completed`, `cancelled`, `incomplete`,  `failed`). 
 * @param reason The reason the Response did not complete. For a `cancelled` Response,  one of `turn_detected` (the server VAD detected a new start of speech)  or `client_cancelled` (the client sent a cancel event). For an  `incomplete` Response, one of `max_output_tokens` or `content_filter`  (the server-side safety filter activated and cut off the response). 
 * @param error 
 */
case class RealtimeResponseStatusDetails(_type: Option[String],
                reason: Option[String],
                error: Option[RealtimeResponseStatusDetailsError]
                )

object RealtimeResponseStatusDetails {
    /**
     * Creates the codec for converting RealtimeResponseStatusDetails from and to JSON.
     */
    implicit val decoder: Decoder[RealtimeResponseStatusDetails] = deriveDecoder
    implicit val encoder: ObjectEncoder[RealtimeResponseStatusDetails] = deriveEncoder
}
