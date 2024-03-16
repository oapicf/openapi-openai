package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param _type 
 * @param message 
 * @param param 
 * @param code 
 */
case class Error(_type: String,
                message: String,
                param: String,
                code: String
                )

object Error {
    /**
     * Creates the codec for converting Error from and to JSON.
     */
    implicit val decoder: Decoder[Error] = deriveDecoder
    implicit val encoder: ObjectEncoder[Error] = deriveEncoder
}
