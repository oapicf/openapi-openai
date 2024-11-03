package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.MessageDeltaContentTextAnnotationsFileCitationObject
import org.openapitools.models.MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation
import org.openapitools.models.MessageDeltaContentTextAnnotationsFilePathObject
import org.openapitools.models.MessageDeltaContentTextAnnotationsFilePathObjectFilePath

/**
 * 
 * @param index The index of the annotation in the text content part.
 * @param _type Always `file_citation`.
 * @param text The text in the message content that needs to be replaced.
 * @param fileUnderscorecitation 
 * @param startUnderscoreindex 
 * @param endUnderscoreindex 
 * @param fileUnderscorepath 
 */
case class MessageDeltaContentTextObjectTextAnnotationsInner(index: Int,
                _type: String,
                text: Option[String],
                fileUnderscorecitation: Option[MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation],
                startUnderscoreindex: Option[Int],
                endUnderscoreindex: Option[Int],
                fileUnderscorepath: Option[MessageDeltaContentTextAnnotationsFilePathObjectFilePath]
                )

object MessageDeltaContentTextObjectTextAnnotationsInner {
    /**
     * Creates the codec for converting MessageDeltaContentTextObjectTextAnnotationsInner from and to JSON.
     */
    implicit val decoder: Decoder[MessageDeltaContentTextObjectTextAnnotationsInner] = deriveDecoder
    implicit val encoder: ObjectEncoder[MessageDeltaContentTextObjectTextAnnotationsInner] = deriveEncoder
}
