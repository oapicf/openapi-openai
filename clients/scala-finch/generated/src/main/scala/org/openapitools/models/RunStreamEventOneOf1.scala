package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.RunObject

/**
 * Occurs when a [run](/docs/api-reference/runs/object) moves to a `queued` status.
 * @param event 
 * @param data 
 */
case class RunStreamEventOneOf1(event: String,
                data: RunObject
                )

object RunStreamEventOneOf1 {
    /**
     * Creates the codec for converting RunStreamEventOneOf1 from and to JSON.
     */
    implicit val decoder: Decoder[RunStreamEventOneOf1] = deriveDecoder
    implicit val encoder: ObjectEncoder[RunStreamEventOneOf1] = deriveEncoder
}
