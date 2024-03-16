package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.FineTuneEvent
import scala.collection.immutable.Seq

/**
 * 
 * @param _object 
 * @param data 
 */
case class ListFineTuneEventsResponse(_object: String,
                data: Seq[FineTuneEvent]
                )

object ListFineTuneEventsResponse {
    /**
     * Creates the codec for converting ListFineTuneEventsResponse from and to JSON.
     */
    implicit val decoder: Decoder[ListFineTuneEventsResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[ListFineTuneEventsResponse] = deriveEncoder
}
