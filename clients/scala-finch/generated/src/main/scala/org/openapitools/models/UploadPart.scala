package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * The upload Part represents a chunk of bytes we can add to an Upload object. 
 * @param id The upload Part unique identifier, which can be referenced in API endpoints.
 * @param createdUnderscoreat The Unix timestamp (in seconds) for when the Part was created.
 * @param uploadUnderscoreid The ID of the Upload object that this Part was added to.
 * @param _object The object type, which is always `upload.part`.
 */
case class UploadPart(id: String,
                createdUnderscoreat: Int,
                uploadUnderscoreid: String,
                _object: String
                )

object UploadPart {
    /**
     * Creates the codec for converting UploadPart from and to JSON.
     */
    implicit val decoder: Decoder[UploadPart] = deriveDecoder
    implicit val encoder: ObjectEncoder[UploadPart] = deriveEncoder
}
