package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.FineTuningJobCheckpoint
import scala.collection.immutable.Seq

/**
 * 
 * @param data 
 * @param _object 
 * @param firstUnderscoreid 
 * @param lastUnderscoreid 
 * @param hasUnderscoremore 
 */
case class ListFineTuningJobCheckpointsResponse(data: Seq[FineTuningJobCheckpoint],
                _object: String,
                firstUnderscoreid: Option[String],
                lastUnderscoreid: Option[String],
                hasUnderscoremore: Boolean
                )

object ListFineTuningJobCheckpointsResponse {
    /**
     * Creates the codec for converting ListFineTuningJobCheckpointsResponse from and to JSON.
     */
    implicit val decoder: Decoder[ListFineTuningJobCheckpointsResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[ListFineTuningJobCheckpointsResponse] = deriveEncoder
}
