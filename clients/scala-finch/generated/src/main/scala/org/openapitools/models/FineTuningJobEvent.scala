package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Fine-tuning job event object
 * @param _object The object type, which is always \"fine_tuning.job.event\".
 * @param id The object identifier.
 * @param createdUnderscoreat The Unix timestamp (in seconds) for when the fine-tuning job was created.
 * @param level The log level of the event.
 * @param message The message of the event.
 * @param _type The type of event.
 * @param data The data associated with the event.
 */
case class FineTuningJobEvent(_object: String,
                id: String,
                createdUnderscoreat: Int,
                level: String,
                message: String,
                _type: Option[String],
                data: Option[Object]
                )

object FineTuningJobEvent {
    /**
     * Creates the codec for converting FineTuningJobEvent from and to JSON.
     */
    implicit val decoder: Decoder[FineTuningJobEvent] = deriveDecoder
    implicit val encoder: ObjectEncoder[FineTuningJobEvent] = deriveEncoder
}
