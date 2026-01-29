package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ThreadObject
import scala.collection.immutable.Seq

/**
 * 
 * @param _object 
 * @param data 
 * @param firstUnderscoreid 
 * @param lastUnderscoreid 
 * @param hasUnderscoremore 
 */
case class ListThreadsResponse(_object: String,
                data: Seq[ThreadObject],
                firstUnderscoreid: String,
                lastUnderscoreid: String,
                hasUnderscoremore: Boolean
                )

object ListThreadsResponse {
    /**
     * Creates the codec for converting ListThreadsResponse from and to JSON.
     */
    implicit val decoder: Decoder[ListThreadsResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[ListThreadsResponse] = deriveEncoder
}
