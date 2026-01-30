package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.RealtimeResponseUsageInputTokenDetails
import org.openapitools.models.RealtimeResponseUsageOutputTokenDetails

/**
 * Usage statistics for the Response, this will correspond to billing. A  Realtime API session will maintain a conversation context and append new  Items to the Conversation, thus output from previous turns (text and  audio tokens) will become the input for later turns. 
 * @param totalUnderscoretokens The total number of tokens in the Response including input and output  text and audio tokens. 
 * @param inputUnderscoretokens The number of input tokens used in the Response, including text and  audio tokens. 
 * @param outputUnderscoretokens The number of output tokens sent in the Response, including text and  audio tokens. 
 * @param inputUnderscoretokenUnderscoredetails 
 * @param outputUnderscoretokenUnderscoredetails 
 */
case class RealtimeResponseUsage(totalUnderscoretokens: Option[Int],
                inputUnderscoretokens: Option[Int],
                outputUnderscoretokens: Option[Int],
                inputUnderscoretokenUnderscoredetails: Option[RealtimeResponseUsageInputTokenDetails],
                outputUnderscoretokenUnderscoredetails: Option[RealtimeResponseUsageOutputTokenDetails]
                )

object RealtimeResponseUsage {
    /**
     * Creates the codec for converting RealtimeResponseUsage from and to JSON.
     */
    implicit val decoder: Decoder[RealtimeResponseUsage] = deriveDecoder
    implicit val encoder: ObjectEncoder[RealtimeResponseUsage] = deriveEncoder
}
