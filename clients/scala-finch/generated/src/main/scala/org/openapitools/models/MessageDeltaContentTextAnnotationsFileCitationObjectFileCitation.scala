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
case class MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation(fileUnderscoreid: Option[String],
                quote: Option[String]
                )

object MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation {
    /**
     * Creates the codec for converting MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation from and to JSON.
     */
    implicit val decoder: Decoder[MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation] = deriveDecoder
    implicit val encoder: ObjectEncoder[MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation] = deriveEncoder
}
