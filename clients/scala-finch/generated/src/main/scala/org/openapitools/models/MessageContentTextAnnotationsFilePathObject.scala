package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.MessageContentTextAnnotationsFilePathObjectFilePath

/**
 * A URL for the file that's generated when the assistant used the `code_interpreter` tool to generate a file.
 * @param _type Always `file_path`.
 * @param text The text in the message content that needs to be replaced.
 * @param fileUnderscorepath 
 * @param startUnderscoreindex 
 * @param endUnderscoreindex 
 */
case class MessageContentTextAnnotationsFilePathObject(_type: String,
                text: String,
                fileUnderscorepath: MessageContentTextAnnotationsFilePathObjectFilePath,
                startUnderscoreindex: Int,
                endUnderscoreindex: Int
                )

object MessageContentTextAnnotationsFilePathObject {
    /**
     * Creates the codec for converting MessageContentTextAnnotationsFilePathObject from and to JSON.
     */
    implicit val decoder: Decoder[MessageContentTextAnnotationsFilePathObject] = deriveDecoder
    implicit val encoder: ObjectEncoder[MessageContentTextAnnotationsFilePathObject] = deriveEncoder
}
