package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.Batch
import scala.collection.immutable.Seq

/**
 * 
 * @param data 
 * @param firstUnderscoreid 
 * @param lastUnderscoreid 
 * @param hasUnderscoremore 
 * @param _object 
 */
case class ListBatchesResponse(data: Seq[Batch],
                firstUnderscoreid: Option[String],
                lastUnderscoreid: Option[String],
                hasUnderscoremore: Boolean,
                _object: String
                )

object ListBatchesResponse {
    /**
     * Creates the codec for converting ListBatchesResponse from and to JSON.
     */
    implicit val decoder: Decoder[ListBatchesResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[ListBatchesResponse] = deriveEncoder
}
