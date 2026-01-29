package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.RunObject

/**
 * Occurs when a new [run](/docs/api-reference/runs/object) is created.
 * @param event 
 * @param data 
 */
case class RunStreamEventOneOf(event: String,
                data: RunObject
                )

object RunStreamEventOneOf {
    /**
     * Creates the codec for converting RunStreamEventOneOf from and to JSON.
     */
    implicit val decoder: Decoder[RunStreamEventOneOf] = deriveDecoder
    implicit val encoder: ObjectEncoder[RunStreamEventOneOf] = deriveEncoder
}
