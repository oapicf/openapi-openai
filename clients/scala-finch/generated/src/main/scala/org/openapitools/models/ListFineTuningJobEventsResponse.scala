package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.FineTuningJobEvent
import scala.collection.immutable.Seq

/**
 * 
 * @param data 
 * @param _object 
 */
case class ListFineTuningJobEventsResponse(data: Seq[FineTuningJobEvent],
                _object: String
                )

object ListFineTuningJobEventsResponse {
    /**
     * Creates the codec for converting ListFineTuningJobEventsResponse from and to JSON.
     */
    implicit val decoder: Decoder[ListFineTuningJobEventsResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[ListFineTuningJobEventsResponse] = deriveEncoder
}
