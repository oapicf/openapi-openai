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
 * @param textUnderscoreoffset 
 * @param tokenUnderscorelogprobs 
 * @param tokens 
 * @param topUnderscorelogprobs 
 */
case class CreateCompletionResponseChoicesInnerLogprobs(textUnderscoreoffset: Option[Seq[Int]],
                tokenUnderscorelogprobs: Option[Seq[BigDecimal]],
                tokens: Option[Seq[String]],
                topUnderscorelogprobs: Option[Seq[Map[String, BigDecimal]]]
                )

object CreateCompletionResponseChoicesInnerLogprobs {
    /**
     * Creates the codec for converting CreateCompletionResponseChoicesInnerLogprobs from and to JSON.
     */
    implicit val decoder: Decoder[CreateCompletionResponseChoicesInnerLogprobs] = deriveDecoder
    implicit val encoder: ObjectEncoder[CreateCompletionResponseChoicesInnerLogprobs] = deriveEncoder
}
