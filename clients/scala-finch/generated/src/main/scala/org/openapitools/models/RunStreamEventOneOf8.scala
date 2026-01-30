package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.RunObject

/**
 * Occurs when a [run](/docs/api-reference/runs/object) is cancelled.
 * @param event 
 * @param data 
 */
case class RunStreamEventOneOf8(event: String,
                data: RunObject
                )

object RunStreamEventOneOf8 {
    /**
     * Creates the codec for converting RunStreamEventOneOf8 from and to JSON.
     */
    implicit val decoder: Decoder[RunStreamEventOneOf8] = deriveDecoder
    implicit val encoder: ObjectEncoder[RunStreamEventOneOf8] = deriveEncoder
}
