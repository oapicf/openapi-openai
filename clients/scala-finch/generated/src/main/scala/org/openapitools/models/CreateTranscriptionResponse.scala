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
case class CreateTranscriptionResponse(text: String
                )

object CreateTranscriptionResponse {
    /**
     * Creates the codec for converting CreateTranscriptionResponse from and to JSON.
     */
    implicit val decoder: Decoder[CreateTranscriptionResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[CreateTranscriptionResponse] = deriveEncoder
}
