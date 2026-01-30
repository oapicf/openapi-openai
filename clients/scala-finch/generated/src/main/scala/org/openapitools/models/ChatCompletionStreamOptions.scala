package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Options for streaming response. Only set this when you set `stream: true`. 
 * @param includeUnderscoreusage If set, an additional chunk will be streamed before the `data: [DONE]` message. The `usage` field on this chunk shows the token usage statistics for the entire request, and the `choices` field will always be an empty array. All other chunks will also include a `usage` field, but with a null value. 
 */
case class ChatCompletionStreamOptions(includeUnderscoreusage: Option[Boolean]
                )

object ChatCompletionStreamOptions {
    /**
     * Creates the codec for converting ChatCompletionStreamOptions from and to JSON.
     */
    implicit val decoder: Decoder[ChatCompletionStreamOptions] = deriveDecoder
    implicit val encoder: ObjectEncoder[ChatCompletionStreamOptions] = deriveEncoder
}
