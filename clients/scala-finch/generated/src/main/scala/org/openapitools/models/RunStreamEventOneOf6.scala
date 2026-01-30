package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.RunObject

/**
 * Occurs when a [run](/docs/api-reference/runs/object) fails.
 * @param event 
 * @param data 
 */
case class RunStreamEventOneOf6(event: String,
                data: RunObject
                )

object RunStreamEventOneOf6 {
    /**
     * Creates the codec for converting RunStreamEventOneOf6 from and to JSON.
     */
    implicit val decoder: Decoder[RunStreamEventOneOf6] = deriveDecoder
    implicit val encoder: ObjectEncoder[RunStreamEventOneOf6] = deriveEncoder
}
