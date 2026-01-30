package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.RealtimeServerEventRateLimitsUpdatedRateLimitsInner
import scala.collection.immutable.Seq

/**
 * Emitted at the beginning of a Response to indicate the updated rate limits.  When a Response is created some tokens will be \"reserved\" for the output  tokens, the rate limits shown here reflect that reservation, which is then  adjusted accordingly once the Response is completed. 
 * @param eventUnderscoreid The unique ID of the server event.
 * @param _type The event type, must be `rate_limits.updated`.
 * @param rateUnderscorelimits List of rate limit information.
 */
case class RealtimeServerEventRateLimitsUpdated(eventUnderscoreid: String,
                _type: String,
                rateUnderscorelimits: Seq[RealtimeServerEventRateLimitsUpdatedRateLimitsInner]
                )

object RealtimeServerEventRateLimitsUpdated {
    /**
     * Creates the codec for converting RealtimeServerEventRateLimitsUpdated from and to JSON.
     */
    implicit val decoder: Decoder[RealtimeServerEventRateLimitsUpdated] = deriveDecoder
    implicit val encoder: ObjectEncoder[RealtimeServerEventRateLimitsUpdated] = deriveEncoder
}
