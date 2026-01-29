package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param _type The type of tool being defined: `retrieval`
 */
case class AssistantToolsRetrieval(_type: String
                )

object AssistantToolsRetrieval {
    /**
     * Creates the codec for converting AssistantToolsRetrieval from and to JSON.
     */
    implicit val decoder: Decoder[AssistantToolsRetrieval] = deriveDecoder
    implicit val encoder: ObjectEncoder[AssistantToolsRetrieval] = deriveEncoder
}
