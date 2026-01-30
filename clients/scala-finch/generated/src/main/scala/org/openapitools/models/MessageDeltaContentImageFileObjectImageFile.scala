package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param fileUnderscoreid The [File](/docs/api-reference/files) ID of the image in the message content. Set `purpose=\"vision\"` when uploading the File if you need to later display the file content.
 * @param detail Specifies the detail level of the image if specified by the user. `low` uses fewer tokens, you can opt in to high resolution using `high`.
 */
case class MessageDeltaContentImageFileObjectImageFile(fileUnderscoreid: Option[String],
                detail: Option[String]
                )

object MessageDeltaContentImageFileObjectImageFile {
    /**
     * Creates the codec for converting MessageDeltaContentImageFileObjectImageFile from and to JSON.
     */
    implicit val decoder: Decoder[MessageDeltaContentImageFileObjectImageFile] = deriveDecoder
    implicit val encoder: ObjectEncoder[MessageDeltaContentImageFileObjectImageFile] = deriveEncoder
}
