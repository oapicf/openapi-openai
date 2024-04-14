package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CreateCompletionResponseChoicesInnerLogprobs

/**
 * 
 * @param finishUnderscorereason The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, or `content_filter` if content was omitted due to a flag from our content filters. 
 * @param index 
 * @param logprobs 
 * @param text 
 */
case class CreateCompletionResponseChoicesInner(finishUnderscorereason: String,
                index: Int,
                logprobs: CreateCompletionResponseChoicesInnerLogprobs,
                text: String
                )

object CreateCompletionResponseChoicesInner {
    /**
     * Creates the codec for converting CreateCompletionResponseChoicesInner from and to JSON.
     */
    implicit val decoder: Decoder[CreateCompletionResponseChoicesInner] = deriveDecoder
    implicit val encoder: ObjectEncoder[CreateCompletionResponseChoicesInner] = deriveEncoder
}
