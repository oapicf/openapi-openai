package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param filename The name of the file to upload. 
 * @param purpose The intended purpose of the uploaded file.  See the [documentation on File purposes](/docs/api-reference/files/create#files-create-purpose). 
 * @param bytes The number of bytes in the file you are uploading. 
 * @param mimeUnderscoretype The MIME type of the file.  This must fall within the supported MIME types for your file purpose. See the supported MIME types for assistants and vision. 
 */
case class CreateUploadRequest(filename: String,
                purpose: String,
                bytes: Int,
                mimeUnderscoretype: String
                )

object CreateUploadRequest {
    /**
     * Creates the codec for converting CreateUploadRequest from and to JSON.
     */
    implicit val decoder: Decoder[CreateUploadRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[CreateUploadRequest] = deriveEncoder
}
