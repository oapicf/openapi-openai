package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.RunStepDetailsToolCallsFileSearchObjectFileSearch

/**
 * 
 * @param id The ID of the tool call object.
 * @param _type The type of tool call. This is always going to be `file_search` for this type of tool call.
 * @param fileUnderscoresearch 
 */
case class RunStepDetailsToolCallsFileSearchObject(id: String,
                _type: String,
                fileUnderscoresearch: RunStepDetailsToolCallsFileSearchObjectFileSearch
                )

object RunStepDetailsToolCallsFileSearchObject {
    /**
     * Creates the codec for converting RunStepDetailsToolCallsFileSearchObject from and to JSON.
     */
    implicit val decoder: Decoder[RunStepDetailsToolCallsFileSearchObject] = deriveDecoder
    implicit val encoder: ObjectEncoder[RunStepDetailsToolCallsFileSearchObject] = deriveEncoder
}
