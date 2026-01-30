package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.RunObject

/**
 * Occurs when a [run](/docs/api-reference/runs/object) expires.
 * @param event 
 * @param data 
 */
case class RunStreamEventOneOf9(event: String,
                data: RunObject
                )

object RunStreamEventOneOf9 {
    /**
     * Creates the codec for converting RunStreamEventOneOf9 from and to JSON.
     */
    implicit val decoder: Decoder[RunStreamEventOneOf9] = deriveDecoder
    implicit val encoder: ObjectEncoder[RunStreamEventOneOf9] = deriveEncoder
}
