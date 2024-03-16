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
case class CreateEditResponseChoicesInner(text: Option[String],
                index: Option[Int],
                logprobs: Option[CreateCompletionResponseChoicesInnerLogprobs],
                finishUnderscorereason: Option[String]
                )

object CreateEditResponseChoicesInner {
    /**
     * Creates the codec for converting CreateEditResponseChoicesInner from and to JSON.
     */
    implicit val decoder: Decoder[CreateEditResponseChoicesInner] = deriveDecoder
    implicit val encoder: ObjectEncoder[CreateEditResponseChoicesInner] = deriveEncoder
}
