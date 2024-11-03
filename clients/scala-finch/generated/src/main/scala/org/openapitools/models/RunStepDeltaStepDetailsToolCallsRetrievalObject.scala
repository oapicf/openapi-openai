package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param index The index of the tool call in the tool calls array.
 * @param id The ID of the tool call object.
 * @param _type The type of tool call. This is always going to be `retrieval` for this type of tool call.
 * @param retrieval For now, this is always going to be an empty object.
 */
case class RunStepDeltaStepDetailsToolCallsRetrievalObject(index: Int,
                id: Option[String],
                _type: String,
                retrieval: Option[Object]
                )

object RunStepDeltaStepDetailsToolCallsRetrievalObject {
    /**
     * Creates the codec for converting RunStepDeltaStepDetailsToolCallsRetrievalObject from and to JSON.
     */
    implicit val decoder: Decoder[RunStepDeltaStepDetailsToolCallsRetrievalObject] = deriveDecoder
    implicit val encoder: ObjectEncoder[RunStepDeltaStepDetailsToolCallsRetrievalObject] = deriveEncoder
}
