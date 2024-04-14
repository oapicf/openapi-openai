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
case class MessageContentTextAnnotationsFilePathObjectFilePath(fileUnderscoreid: String
                )

object MessageContentTextAnnotationsFilePathObjectFilePath {
    /**
     * Creates the codec for converting MessageContentTextAnnotationsFilePathObjectFilePath from and to JSON.
     */
    implicit val decoder: Decoder[MessageContentTextAnnotationsFilePathObjectFilePath] = deriveDecoder
    implicit val encoder: ObjectEncoder[MessageContentTextAnnotationsFilePathObjectFilePath] = deriveEncoder
}
