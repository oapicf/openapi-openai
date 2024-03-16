package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * ID of the model to use. Only `whisper-1` is currently available. 
 */
case class CreateTranscriptionRequestModel()

object CreateTranscriptionRequestModel {
    /**
     * Creates the codec for converting CreateTranscriptionRequestModel from and to JSON.
     */
    implicit val decoder: Decoder[CreateTranscriptionRequestModel] = deriveDecoder
    implicit val encoder: ObjectEncoder[CreateTranscriptionRequestModel] = deriveEncoder
}
