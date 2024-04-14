package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param fileUnderscoreid The [File](/docs/api-reference/files) ID of the image in the message content.
 */
case class MessageContentImageFileObjectImageFile(fileUnderscoreid: String
                )

object MessageContentImageFileObjectImageFile {
    /**
     * Creates the codec for converting MessageContentImageFileObjectImageFile from and to JSON.
     */
    implicit val decoder: Decoder[MessageContentImageFileObjectImageFile] = deriveDecoder
    implicit val encoder: ObjectEncoder[MessageContentImageFileObjectImageFile] = deriveEncoder
}
