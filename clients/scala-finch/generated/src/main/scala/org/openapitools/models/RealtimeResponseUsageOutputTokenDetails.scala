package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Details about the output tokens used in the Response.
 * @param textUnderscoretokens The number of text tokens used in the Response.
 * @param audioUnderscoretokens The number of audio tokens used in the Response.
 */
case class RealtimeResponseUsageOutputTokenDetails(textUnderscoretokens: Option[Int],
                audioUnderscoretokens: Option[Int]
                )

object RealtimeResponseUsageOutputTokenDetails {
    /**
     * Creates the codec for converting RealtimeResponseUsageOutputTokenDetails from and to JSON.
     */
    implicit val decoder: Decoder[RealtimeResponseUsageOutputTokenDetails] = deriveDecoder
    implicit val encoder: ObjectEncoder[RealtimeResponseUsageOutputTokenDetails] = deriveEncoder
}
