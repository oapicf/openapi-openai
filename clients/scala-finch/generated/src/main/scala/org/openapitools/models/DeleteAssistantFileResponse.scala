package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Deletes the association between the assistant and the file, but does not delete the [File](/docs/api-reference/files) object itself.
 * @param id 
 * @param deleted 
 * @param _object 
 */
case class DeleteAssistantFileResponse(id: String,
                deleted: Boolean,
                _object: String
                )

object DeleteAssistantFileResponse {
    /**
     * Creates the codec for converting DeleteAssistantFileResponse from and to JSON.
     */
    implicit val decoder: Decoder[DeleteAssistantFileResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[DeleteAssistantFileResponse] = deriveEncoder
}
