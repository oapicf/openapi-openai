package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param fileUnderscoreid The ID of the specific File the citation is from.
 * @param quote The specific quote in the file.
 */
case class MessageContentTextAnnotationsFileCitationObjectFileCitation(fileUnderscoreid: String,
                quote: String
                )

object MessageContentTextAnnotationsFileCitationObjectFileCitation {
    /**
     * Creates the codec for converting MessageContentTextAnnotationsFileCitationObjectFileCitation from and to JSON.
     */
    implicit val decoder: Decoder[MessageContentTextAnnotationsFileCitationObjectFileCitation] = deriveDecoder
    implicit val encoder: ObjectEncoder[MessageContentTextAnnotationsFileCitationObjectFileCitation] = deriveEncoder
}
