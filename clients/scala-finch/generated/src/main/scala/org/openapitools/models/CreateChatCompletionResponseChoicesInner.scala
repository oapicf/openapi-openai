package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ChatCompletionResponseMessage
import org.openapitools.models.CreateChatCompletionResponseChoicesInnerLogprobs

/**
 * 
 * @param finishUnderscorereason The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, `content_filter` if content was omitted due to a flag from our content filters, `tool_calls` if the model called a tool, or `function_call` (deprecated) if the model called a function. 
 * @param index The index of the choice in the list of choices.
 * @param message 
 * @param logprobs 
 */
case class CreateChatCompletionResponseChoicesInner(finishUnderscorereason: String,
                index: Int,
                message: ChatCompletionResponseMessage,
                logprobs: CreateChatCompletionResponseChoicesInnerLogprobs
                )

object CreateChatCompletionResponseChoicesInner {
    /**
     * Creates the codec for converting CreateChatCompletionResponseChoicesInner from and to JSON.
     */
    implicit val decoder: Decoder[CreateChatCompletionResponseChoicesInner] = deriveDecoder
    implicit val encoder: ObjectEncoder[CreateChatCompletionResponseChoicesInner] = deriveEncoder
}
