package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param _type The type of response format being defined: `json_object`
 */
case class ResponseFormatJsonObject(_type: String
                )

object ResponseFormatJsonObject {
    /**
     * Creates the codec for converting ResponseFormatJsonObject from and to JSON.
     */
    implicit val decoder: Decoder[ResponseFormatJsonObject] = deriveDecoder
    implicit val encoder: ObjectEncoder[ResponseFormatJsonObject] = deriveEncoder
}
