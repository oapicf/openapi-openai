package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param _type The type of the content.
 * @param text The text content of the file.
 */
case class RunStepDetailsToolCallsFileSearchResultObjectContentInner(_type: Option[String],
                text: Option[String]
                )

object RunStepDetailsToolCallsFileSearchResultObjectContentInner {
    /**
     * Creates the codec for converting RunStepDetailsToolCallsFileSearchResultObjectContentInner from and to JSON.
     */
    implicit val decoder: Decoder[RunStepDetailsToolCallsFileSearchResultObjectContentInner] = deriveDecoder
    implicit val encoder: ObjectEncoder[RunStepDetailsToolCallsFileSearchResultObjectContentInner] = deriveEncoder
}
