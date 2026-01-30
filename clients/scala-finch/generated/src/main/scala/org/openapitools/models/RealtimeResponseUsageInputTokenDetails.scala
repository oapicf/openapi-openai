package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Details about the input tokens used in the Response.
 * @param cachedUnderscoretokens The number of cached tokens used in the Response.
 * @param textUnderscoretokens The number of text tokens used in the Response.
 * @param audioUnderscoretokens The number of audio tokens used in the Response.
 */
case class RealtimeResponseUsageInputTokenDetails(cachedUnderscoretokens: Option[Int],
                textUnderscoretokens: Option[Int],
                audioUnderscoretokens: Option[Int]
                )

object RealtimeResponseUsageInputTokenDetails {
    /**
     * Creates the codec for converting RealtimeResponseUsageInputTokenDetails from and to JSON.
     */
    implicit val decoder: Decoder[RealtimeResponseUsageInputTokenDetails] = deriveDecoder
    implicit val encoder: ObjectEncoder[RealtimeResponseUsageInputTokenDetails] = deriveEncoder
}
