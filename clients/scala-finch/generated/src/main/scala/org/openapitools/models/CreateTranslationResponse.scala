package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param text 
 */
case class CreateTranslationResponse(text: String
                )

object CreateTranslationResponse {
    /**
     * Creates the codec for converting CreateTranslationResponse from and to JSON.
     */
    implicit val decoder: Decoder[CreateTranslationResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[CreateTranslationResponse] = deriveEncoder
}
