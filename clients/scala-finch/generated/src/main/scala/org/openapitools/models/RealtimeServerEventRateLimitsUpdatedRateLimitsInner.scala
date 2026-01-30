package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BigDecimal

/**
 * 
 * @param name The name of the rate limit (`requests`, `tokens`). 
 * @param limit The maximum allowed value for the rate limit.
 * @param remaining The remaining value before the limit is reached.
 * @param resetUnderscoreseconds Seconds until the rate limit resets.
 */
case class RealtimeServerEventRateLimitsUpdatedRateLimitsInner(name: Option[String],
                limit: Option[Int],
                remaining: Option[Int],
                resetUnderscoreseconds: Option[BigDecimal]
                )

object RealtimeServerEventRateLimitsUpdatedRateLimitsInner {
    /**
     * Creates the codec for converting RealtimeServerEventRateLimitsUpdatedRateLimitsInner from and to JSON.
     */
    implicit val decoder: Decoder[RealtimeServerEventRateLimitsUpdatedRateLimitsInner] = deriveDecoder
    implicit val encoder: ObjectEncoder[RealtimeServerEventRateLimitsUpdatedRateLimitsInner] = deriveEncoder
}
