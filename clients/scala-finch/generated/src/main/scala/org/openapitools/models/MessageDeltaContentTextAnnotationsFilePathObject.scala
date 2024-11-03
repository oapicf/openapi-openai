package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.MessageDeltaContentTextAnnotationsFilePathObjectFilePath

/**
 * A URL for the file that's generated when the assistant used the `code_interpreter` tool to generate a file.
 * @param index The index of the annotation in the text content part.
 * @param _type Always `file_path`.
 * @param text The text in the message content that needs to be replaced.
 * @param fileUnderscorepath 
 * @param startUnderscoreindex 
 * @param endUnderscoreindex 
 */
case class MessageDeltaContentTextAnnotationsFilePathObject(index: Int,
                _type: String,
                text: Option[String],
                fileUnderscorepath: Option[MessageDeltaContentTextAnnotationsFilePathObjectFilePath],
                startUnderscoreindex: Option[Int],
                endUnderscoreindex: Option[Int]
                )

object MessageDeltaContentTextAnnotationsFilePathObject {
    /**
     * Creates the codec for converting MessageDeltaContentTextAnnotationsFilePathObject from and to JSON.
     */
    implicit val decoder: Decoder[MessageDeltaContentTextAnnotationsFilePathObject] = deriveDecoder
    implicit val encoder: ObjectEncoder[MessageDeltaContentTextAnnotationsFilePathObject] = deriveEncoder
}
