package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BigDecimal
import scala.collection.immutable.Seq

/**
 * 
 * @param token The token.
 * @param logprob The log probability of this token, if it is within the top 20 most likely tokens. Otherwise, the value `-9999.0` is used to signify that the token is very unlikely.
 * @param bytes A list of integers representing the UTF-8 bytes representation of the token. Useful in instances where characters are represented by multiple tokens and their byte representations must be combined to generate the correct text representation. Can be `null` if there is no bytes representation for the token.
 */
case class ChatCompletionTokenLogprobTopLogprobsInner(token: String,
                logprob: BigDecimal,
                bytes: Seq[Int]
                )

object ChatCompletionTokenLogprobTopLogprobsInner {
    /**
     * Creates the codec for converting ChatCompletionTokenLogprobTopLogprobsInner from and to JSON.
     */
    implicit val decoder: Decoder[ChatCompletionTokenLogprobTopLogprobsInner] = deriveDecoder
    implicit val encoder: ObjectEncoder[ChatCompletionTokenLogprobTopLogprobsInner] = deriveEncoder
}
