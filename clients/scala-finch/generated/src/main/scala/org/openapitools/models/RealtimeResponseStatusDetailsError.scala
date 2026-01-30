package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * A description of the error that caused the response to fail,  populated when the `status` is `failed`. 
 * @param _type The type of error.
 * @param code Error code, if any.
 */
case class RealtimeResponseStatusDetailsError(_type: Option[String],
                code: Option[String]
                )

object RealtimeResponseStatusDetailsError {
    /**
     * Creates the codec for converting RealtimeResponseStatusDetailsError from and to JSON.
     */
    implicit val decoder: Decoder[RealtimeResponseStatusDetailsError] = deriveDecoder
    implicit val encoder: ObjectEncoder[RealtimeResponseStatusDetailsError] = deriveEncoder
}
