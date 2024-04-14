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
 * @param data 
 * @param _object 
 */
case class ListFilesResponse(data: Seq[OpenAIFile],
                _object: String
                )

object ListFilesResponse {
    /**
     * Creates the codec for converting ListFilesResponse from and to JSON.
     */
    implicit val decoder: Decoder[ListFilesResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[ListFilesResponse] = deriveEncoder
}
