package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * An optional field that will only be present when you set `stream_options: {\"include_usage\": true}` in your request. When present, it contains a null value except for the last chunk which contains the token usage statistics for the entire request. 
 * @param completionUnderscoretokens Number of tokens in the generated completion.
 * @param promptUnderscoretokens Number of tokens in the prompt.
 * @param totalUnderscoretokens Total number of tokens used in the request (prompt + completion).
 */
case class CreateChatCompletionStreamResponseUsage(completionUnderscoretokens: Int,
                promptUnderscoretokens: Int,
                totalUnderscoretokens: Int
                )

object CreateChatCompletionStreamResponseUsage {
    /**
     * Creates the codec for converting CreateChatCompletionStreamResponseUsage from and to JSON.
     */
    implicit val decoder: Decoder[CreateChatCompletionStreamResponseUsage] = deriveDecoder
    implicit val encoder: ObjectEncoder[CreateChatCompletionStreamResponseUsage] = deriveEncoder
}
