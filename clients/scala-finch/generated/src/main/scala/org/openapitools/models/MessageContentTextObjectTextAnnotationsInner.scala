package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.MessageContentTextAnnotationsFileCitationObject
import org.openapitools.models.MessageContentTextAnnotationsFileCitationObjectFileCitation
import org.openapitools.models.MessageContentTextAnnotationsFilePathObject
import org.openapitools.models.MessageContentTextAnnotationsFilePathObjectFilePath

/**
 * 
 * @param _type Always `file_citation`.
 * @param text The text in the message content that needs to be replaced.
 * @param fileUnderscorecitation 
 * @param startUnderscoreindex 
 * @param endUnderscoreindex 
 * @param fileUnderscorepath 
 */
case class MessageContentTextObjectTextAnnotationsInner(_type: String,
                text: String,
                fileUnderscorecitation: MessageContentTextAnnotationsFileCitationObjectFileCitation,
                startUnderscoreindex: Int,
                endUnderscoreindex: Int,
                fileUnderscorepath: MessageContentTextAnnotationsFilePathObjectFilePath
                )

object MessageContentTextObjectTextAnnotationsInner {
    /**
     * Creates the codec for converting MessageContentTextObjectTextAnnotationsInner from and to JSON.
     */
    implicit val decoder: Decoder[MessageContentTextObjectTextAnnotationsInner] = deriveDecoder
    implicit val encoder: ObjectEncoder[MessageContentTextObjectTextAnnotationsInner] = deriveEncoder
}
