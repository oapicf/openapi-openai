package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param id 
 * @param deleted 
 * @param _object 
 */
case class DeleteAssistantResponse(id: String,
                deleted: Boolean,
                _object: String
                )

object DeleteAssistantResponse {
    /**
     * Creates the codec for converting DeleteAssistantResponse from and to JSON.
     */
    implicit val decoder: Decoder[DeleteAssistantResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[DeleteAssistantResponse] = deriveEncoder
}
