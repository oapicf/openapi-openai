package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OpenAIFile
import scala.collection.immutable.Seq

/**
 * 
 * @param _object 
 * @param data 
 */
case class ListFilesResponse(_object: String,
                data: Seq[OpenAIFile]
                )

object ListFilesResponse {
    /**
     * Creates the codec for converting ListFilesResponse from and to JSON.
     */
    implicit val decoder: Decoder[ListFilesResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[ListFilesResponse] = deriveEncoder
}
