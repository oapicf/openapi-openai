package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CreateCompletionResponseChoicesInnerLogprobs

/**
 * 
 * @param text 
 * @param index 
 * @param logprobs 
 * @param finishUnderscorereason 
 */
case class CreateCompletionResponseChoicesInner(text: String,
                index: Int,
                logprobs: CreateCompletionResponseChoicesInnerLogprobs,
                finishUnderscorereason: String
                )

object CreateCompletionResponseChoicesInner {
    /**
     * Creates the codec for converting CreateCompletionResponseChoicesInner from and to JSON.
     */
    implicit val decoder: Decoder[CreateCompletionResponseChoicesInner] = deriveDecoder
    implicit val encoder: ObjectEncoder[CreateCompletionResponseChoicesInner] = deriveEncoder
}
