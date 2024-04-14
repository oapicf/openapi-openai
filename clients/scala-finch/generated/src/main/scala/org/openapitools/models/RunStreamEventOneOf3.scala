package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.RunObject

/**
 * Occurs when a [run](/docs/api-reference/runs/object) moves to a `requires_action` status.
 * @param event 
 * @param data 
 */
case class RunStreamEventOneOf3(event: String,
                data: RunObject
                )

object RunStreamEventOneOf3 {
    /**
     * Creates the codec for converting RunStreamEventOneOf3 from and to JSON.
     */
    implicit val decoder: Decoder[RunStreamEventOneOf3] = deriveDecoder
    implicit val encoder: ObjectEncoder[RunStreamEventOneOf3] = deriveEncoder
}
