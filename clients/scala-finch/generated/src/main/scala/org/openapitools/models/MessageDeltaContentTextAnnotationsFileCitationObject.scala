package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation

/**
 * A citation within the message that points to a specific quote from a specific File associated with the assistant or the message. Generated when the assistant uses the \"file_search\" tool to search files.
 * @param index The index of the annotation in the text content part.
 * @param _type Always `file_citation`.
 * @param text The text in the message content that needs to be replaced.
 * @param fileUnderscorecitation 
 * @param startUnderscoreindex 
 * @param endUnderscoreindex 
 */
case class MessageDeltaContentTextAnnotationsFileCitationObject(index: Int,
                _type: String,
                text: Option[String],
                fileUnderscorecitation: Option[MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation],
                startUnderscoreindex: Option[Int],
                endUnderscoreindex: Option[Int]
                )

object MessageDeltaContentTextAnnotationsFileCitationObject {
    /**
     * Creates the codec for converting MessageDeltaContentTextAnnotationsFileCitationObject from and to JSON.
     */
    implicit val decoder: Decoder[MessageDeltaContentTextAnnotationsFileCitationObject] = deriveDecoder
    implicit val encoder: ObjectEncoder[MessageDeltaContentTextAnnotationsFileCitationObject] = deriveEncoder
}
