package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ThreadObject

/**
 * Occurs when a new [thread](/docs/api-reference/threads/object) is created.
 * @param event 
 * @param data 
 */
case class ThreadStreamEventOneOf(event: String,
                data: ThreadObject
                )

object ThreadStreamEventOneOf {
    /**
     * Creates the codec for converting ThreadStreamEventOneOf from and to JSON.
     */
    implicit val decoder: Decoder[ThreadStreamEventOneOf] = deriveDecoder
    implicit val encoder: ObjectEncoder[ThreadStreamEventOneOf] = deriveEncoder
}
