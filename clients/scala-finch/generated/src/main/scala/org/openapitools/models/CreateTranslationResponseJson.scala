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
case class CreateTranslationResponseJson(text: String
                )

object CreateTranslationResponseJson {
    /**
     * Creates the codec for converting CreateTranslationResponseJson from and to JSON.
     */
    implicit val decoder: Decoder[CreateTranslationResponseJson] = deriveDecoder
    implicit val encoder: ObjectEncoder[CreateTranslationResponseJson] = deriveEncoder
}
