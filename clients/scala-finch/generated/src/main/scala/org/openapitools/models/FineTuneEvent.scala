package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param _object 
 * @param createdUnderscoreat 
 * @param level 
 * @param message 
 */
case class FineTuneEvent(_object: String,
                createdUnderscoreat: Int,
                level: String,
                message: String
                )

object FineTuneEvent {
    /**
     * Creates the codec for converting FineTuneEvent from and to JSON.
     */
    implicit val decoder: Decoder[FineTuneEvent] = deriveDecoder
    implicit val encoder: ObjectEncoder[FineTuneEvent] = deriveEncoder
}
