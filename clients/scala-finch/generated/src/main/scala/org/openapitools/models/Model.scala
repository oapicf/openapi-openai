package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param id 
 * @param _object 
 * @param created 
 * @param ownedUnderscoreby 
 */
case class Model(id: String,
                _object: String,
                created: Int,
                ownedUnderscoreby: String
                )

object Model {
    /**
     * Creates the codec for converting Model from and to JSON.
     */
    implicit val decoder: Decoder[Model] = deriveDecoder
    implicit val encoder: ObjectEncoder[Model] = deriveEncoder
}
