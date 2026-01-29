package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BigDecimal
import org.openapitools.models.ChatCompletionTokenLogprobTopLogprobsInner
import scala.collection.immutable.Seq

/**
 * 
 * @param token The token.
 * @param logprob The log probability of this token, if it is within the top 20 most likely tokens. Otherwise, the value `-9999.0` is used to signify that the token is very unlikely.
 * @param bytes A list of integers representing the UTF-8 bytes representation of the token. Useful in instances where characters are represented by multiple tokens and their byte representations must be combined to generate the correct text representation. Can be `null` if there is no bytes representation for the token.
 * @param topUnderscorelogprobs List of the most likely tokens and their log probability, at this token position. In rare cases, there may be fewer than the number of requested `top_logprobs` returned.
 */
case class ChatCompletionTokenLogprob(token: String,
                logprob: BigDecimal,
                bytes: Seq[Int],
                topUnderscorelogprobs: Seq[ChatCompletionTokenLogprobTopLogprobsInner]
                )

object ChatCompletionTokenLogprob {
    /**
     * Creates the codec for converting ChatCompletionTokenLogprob from and to JSON.
     */
    implicit val decoder: Decoder[ChatCompletionTokenLogprob] = deriveDecoder
    implicit val encoder: ObjectEncoder[ChatCompletionTokenLogprob] = deriveEncoder
}
