package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param _type The type of response format being defined: `text`
 */
case class ResponseFormatText(_type: String
                )

object ResponseFormatText {
    /**
     * Creates the codec for converting ResponseFormatText from and to JSON.
     */
    implicit val decoder: Decoder[ResponseFormatText] = deriveDecoder
    implicit val encoder: ObjectEncoder[ResponseFormatText] = deriveEncoder
}
