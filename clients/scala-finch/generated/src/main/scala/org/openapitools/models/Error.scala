package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param code 
 * @param message 
 * @param param 
 * @param _type 
 */
case class Error(code: String,
                message: String,
                param: String,
                _type: String
                )

object Error {
    /**
     * Creates the codec for converting Error from and to JSON.
     */
    implicit val decoder: Decoder[Error] = deriveDecoder
    implicit val encoder: ObjectEncoder[Error] = deriveEncoder
}
