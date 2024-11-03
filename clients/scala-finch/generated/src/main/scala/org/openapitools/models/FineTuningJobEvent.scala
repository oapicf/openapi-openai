package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Fine-tuning job event object
 * @param id 
 * @param createdUnderscoreat 
 * @param level 
 * @param message 
 * @param _object 
 */
case class FineTuningJobEvent(id: String,
                createdUnderscoreat: Int,
                level: String,
                message: String,
                _object: String
                )

object FineTuningJobEvent {
    /**
     * Creates the codec for converting FineTuningJobEvent from and to JSON.
     */
    implicit val decoder: Decoder[FineTuningJobEvent] = deriveDecoder
    implicit val encoder: ObjectEncoder[FineTuningJobEvent] = deriveEncoder
}
