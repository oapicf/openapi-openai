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
 * @param tokens 
 * @param tokenUnderscorelogprobs 
 * @param topUnderscorelogprobs 
 * @param textUnderscoreoffset 
 */
case class CreateCompletionResponseChoicesInnerLogprobs(tokens: Option[Seq[String]],
                tokenUnderscorelogprobs: Option[Seq[BigDecimal]],
                topUnderscorelogprobs: Option[Seq[Object]],
                textUnderscoreoffset: Option[Seq[Int]]
                )

object CreateCompletionResponseChoicesInnerLogprobs {
    /**
     * Creates the codec for converting CreateCompletionResponseChoicesInnerLogprobs from and to JSON.
     */
    implicit val decoder: Decoder[CreateCompletionResponseChoicesInnerLogprobs] = deriveDecoder
    implicit val encoder: ObjectEncoder[CreateCompletionResponseChoicesInnerLogprobs] = deriveEncoder
}
