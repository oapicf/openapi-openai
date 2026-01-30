package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Returned when the model-generated function call arguments are done streaming. Also emitted when a Response is interrupted, incomplete, or cancelled. 
 * @param eventUnderscoreid The unique ID of the server event.
 * @param _type The event type, must be `response.function_call_arguments.done`. 
 * @param responseUnderscoreid The ID of the response.
 * @param itemUnderscoreid The ID of the function call item.
 * @param outputUnderscoreindex The index of the output item in the response.
 * @param callUnderscoreid The ID of the function call.
 * @param arguments The final arguments as a JSON string.
 */
case class RealtimeServerEventResponseFunctionCallArgumentsDone(eventUnderscoreid: String,
                _type: String,
                responseUnderscoreid: String,
                itemUnderscoreid: String,
                outputUnderscoreindex: Int,
                callUnderscoreid: String,
                arguments: String
                )

object RealtimeServerEventResponseFunctionCallArgumentsDone {
    /**
     * Creates the codec for converting RealtimeServerEventResponseFunctionCallArgumentsDone from and to JSON.
     */
    implicit val decoder: Decoder[RealtimeServerEventResponseFunctionCallArgumentsDone] = deriveDecoder
    implicit val encoder: ObjectEncoder[RealtimeServerEventResponseFunctionCallArgumentsDone] = deriveEncoder
}
