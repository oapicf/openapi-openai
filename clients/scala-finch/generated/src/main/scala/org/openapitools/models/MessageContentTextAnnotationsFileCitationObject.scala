package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.MessageContentTextAnnotationsFileCitationObjectFileCitation

/**
 * A citation within the message that points to a specific quote from a specific File associated with the assistant or the message. Generated when the assistant uses the \"retrieval\" tool to search files.
 * @param _type Always `file_citation`.
 * @param text The text in the message content that needs to be replaced.
 * @param fileUnderscorecitation 
 * @param startUnderscoreindex 
 * @param endUnderscoreindex 
 */
case class MessageContentTextAnnotationsFileCitationObject(_type: String,
                text: String,
                fileUnderscorecitation: MessageContentTextAnnotationsFileCitationObjectFileCitation,
                startUnderscoreindex: Int,
                endUnderscoreindex: Int
                )

object MessageContentTextAnnotationsFileCitationObject {
    /**
     * Creates the codec for converting MessageContentTextAnnotationsFileCitationObject from and to JSON.
     */
    implicit val decoder: Decoder[MessageContentTextAnnotationsFileCitationObject] = deriveDecoder
    implicit val encoder: ObjectEncoder[MessageContentTextAnnotationsFileCitationObject] = deriveEncoder
}
