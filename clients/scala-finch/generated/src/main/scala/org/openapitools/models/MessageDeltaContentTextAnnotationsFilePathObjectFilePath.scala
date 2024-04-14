package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param fileUnderscoreid The ID of the file that was generated.
 */
case class MessageDeltaContentTextAnnotationsFilePathObjectFilePath(fileUnderscoreid: Option[String]
                )

object MessageDeltaContentTextAnnotationsFilePathObjectFilePath {
    /**
     * Creates the codec for converting MessageDeltaContentTextAnnotationsFilePathObjectFilePath from and to JSON.
     */
    implicit val decoder: Decoder[MessageDeltaContentTextAnnotationsFilePathObjectFilePath] = deriveDecoder
    implicit val encoder: ObjectEncoder[MessageDeltaContentTextAnnotationsFilePathObjectFilePath] = deriveEncoder
}
