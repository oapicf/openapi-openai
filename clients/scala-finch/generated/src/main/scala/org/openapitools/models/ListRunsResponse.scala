package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.RunObject
import scala.collection.immutable.Seq

/**
 * 
 * @param _object 
 * @param data 
 * @param firstUnderscoreid 
 * @param lastUnderscoreid 
 * @param hasUnderscoremore 
 */
case class ListRunsResponse(_object: String,
                data: Seq[RunObject],
                firstUnderscoreid: String,
                lastUnderscoreid: String,
                hasUnderscoremore: Boolean
                )

object ListRunsResponse {
    /**
     * Creates the codec for converting ListRunsResponse from and to JSON.
     */
    implicit val decoder: Decoder[ListRunsResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[ListRunsResponse] = deriveEncoder
}
