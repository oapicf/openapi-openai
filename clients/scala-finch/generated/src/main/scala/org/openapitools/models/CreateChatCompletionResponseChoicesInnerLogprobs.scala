package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ChatCompletionTokenLogprob
import scala.collection.immutable.Seq

/**
 * Log probability information for the choice.
 * @param content A list of message content tokens with log probability information.
 * @param refusal A list of message refusal tokens with log probability information.
 */
case class CreateChatCompletionResponseChoicesInnerLogprobs(content: Seq[ChatCompletionTokenLogprob],
                refusal: Seq[ChatCompletionTokenLogprob]
                )

object CreateChatCompletionResponseChoicesInnerLogprobs {
    /**
     * Creates the codec for converting CreateChatCompletionResponseChoicesInnerLogprobs from and to JSON.
     */
    implicit val decoder: Decoder[CreateChatCompletionResponseChoicesInnerLogprobs] = deriveDecoder
    implicit val encoder: ObjectEncoder[CreateChatCompletionResponseChoicesInnerLogprobs] = deriveEncoder
}
