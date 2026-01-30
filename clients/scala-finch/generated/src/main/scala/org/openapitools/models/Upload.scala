package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OpenAIFile

/**
 * The Upload object can accept byte chunks in the form of Parts. 
 * @param id The Upload unique identifier, which can be referenced in API endpoints.
 * @param createdUnderscoreat The Unix timestamp (in seconds) for when the Upload was created.
 * @param filename The name of the file to be uploaded.
 * @param bytes The intended number of bytes to be uploaded.
 * @param purpose The intended purpose of the file. [Please refer here](/docs/api-reference/files/object#files/object-purpose) for acceptable values.
 * @param status The status of the Upload.
 * @param expiresUnderscoreat The Unix timestamp (in seconds) for when the Upload was created.
 * @param _object The object type, which is always \"upload\".
 * @param file 
 */
case class Upload(id: String,
                createdUnderscoreat: Int,
                filename: String,
                bytes: Int,
                purpose: String,
                status: String,
                expiresUnderscoreat: Int,
                _object: Option[String],
                file: Option[OpenAIFile]
                )

object Upload {
    /**
     * Creates the codec for converting Upload from and to JSON.
     */
    implicit val decoder: Decoder[Upload] = deriveDecoder
    implicit val encoder: ObjectEncoder[Upload] = deriveEncoder
}
