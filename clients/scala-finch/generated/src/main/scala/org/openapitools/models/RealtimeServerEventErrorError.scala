package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Details of the error.
 * @param _type The type of error (e.g., \"invalid_request_error\", \"server_error\"). 
 * @param code Error code, if any.
 * @param message A human-readable error message.
 * @param param Parameter related to the error, if any.
 * @param eventUnderscoreid The event_id of the client event that caused the error, if applicable. 
 */
case class RealtimeServerEventErrorError(_type: String,
                code: Option[String],
                message: String,
                param: Option[String],
                eventUnderscoreid: Option[String]
                )

object RealtimeServerEventErrorError {
    /**
     * Creates the codec for converting RealtimeServerEventErrorError from and to JSON.
     */
    implicit val decoder: Decoder[RealtimeServerEventErrorError] = deriveDecoder
    implicit val encoder: ObjectEncoder[RealtimeServerEventErrorError] = deriveEncoder
}
