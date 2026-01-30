package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param _object 
 * @param id 
 * @param deleted 
 */
case class UserDeleteResponse(_object: String,
                id: String,
                deleted: Boolean
                )

object UserDeleteResponse {
    /**
     * Creates the codec for converting UserDeleteResponse from and to JSON.
     */
    implicit val decoder: Decoder[UserDeleteResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[UserDeleteResponse] = deriveEncoder
}
