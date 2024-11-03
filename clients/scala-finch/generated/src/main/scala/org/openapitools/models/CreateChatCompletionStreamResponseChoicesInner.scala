package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ChatCompletionStreamResponseDelta
import org.openapitools.models.CreateChatCompletionResponseChoicesInnerLogprobs

/**
 * 
 * @param delta 
 * @param logprobs 
 * @param finishUnderscorereason The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, `content_filter` if content was omitted due to a flag from our content filters, `tool_calls` if the model called a tool, or `function_call` (deprecated) if the model called a function. 
 * @param index The index of the choice in the list of choices.
 */
case class CreateChatCompletionStreamResponseChoicesInner(delta: ChatCompletionStreamResponseDelta,
                logprobs: Option[CreateChatCompletionResponseChoicesInnerLogprobs],
                finishUnderscorereason: String,
                index: Int
                )

object CreateChatCompletionStreamResponseChoicesInner {
    /**
     * Creates the codec for converting CreateChatCompletionStreamResponseChoicesInner from and to JSON.
     */
    implicit val decoder: Decoder[CreateChatCompletionStreamResponseChoicesInner] = deriveDecoder
    implicit val encoder: ObjectEncoder[CreateChatCompletionStreamResponseChoicesInner] = deriveEncoder
}
