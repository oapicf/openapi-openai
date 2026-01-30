package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.RunObject
import org.openapitools.models.RunStreamEventOneOf
import org.openapitools.models.RunStreamEventOneOf1
import org.openapitools.models.RunStreamEventOneOf2
import org.openapitools.models.RunStreamEventOneOf3
import org.openapitools.models.RunStreamEventOneOf4
import org.openapitools.models.RunStreamEventOneOf5
import org.openapitools.models.RunStreamEventOneOf6
import org.openapitools.models.RunStreamEventOneOf7
import org.openapitools.models.RunStreamEventOneOf8
import org.openapitools.models.RunStreamEventOneOf9

/**
 * 
 * @param event 
 * @param data 
 */
case class RunStreamEvent(event: String,
                data: RunObject
                )

object RunStreamEvent {
    /**
     * Creates the codec for converting RunStreamEvent from and to JSON.
     */
    implicit val decoder: Decoder[RunStreamEvent] = deriveDecoder
    implicit val encoder: ObjectEncoder[RunStreamEvent] = deriveEncoder
}
