package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.MessageFileObject
import scala.collection.immutable.Seq

/**
 * 
 * @param _object 
 * @param data 
 * @param firstUnderscoreid 
 * @param lastUnderscoreid 
 * @param hasUnderscoremore 
 */
case class ListMessageFilesResponse(_object: String,
                data: Seq[MessageFileObject],
                firstUnderscoreid: String,
                lastUnderscoreid: String,
                hasUnderscoremore: Boolean
                )

object ListMessageFilesResponse {
    /**
     * Creates the codec for converting ListMessageFilesResponse from and to JSON.
     */
    implicit val decoder: Decoder[ListMessageFilesResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[ListMessageFilesResponse] = deriveEncoder
}
