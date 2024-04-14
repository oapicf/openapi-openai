package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param id The ID of the tool call object.
 * @param _type The type of tool call. This is always going to be `retrieval` for this type of tool call.
 * @param retrieval For now, this is always going to be an empty object.
 */
case class RunStepDetailsToolCallsRetrievalObject(id: String,
                _type: String,
                retrieval: Object
                )

object RunStepDetailsToolCallsRetrievalObject {
    /**
     * Creates the codec for converting RunStepDetailsToolCallsRetrievalObject from and to JSON.
     */
    implicit val decoder: Decoder[RunStepDetailsToolCallsRetrievalObject] = deriveDecoder
    implicit val encoder: ObjectEncoder[RunStepDetailsToolCallsRetrievalObject] = deriveEncoder
}
