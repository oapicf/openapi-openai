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
case class ProjectUserDeleteResponse(_object: String,
                id: String,
                deleted: Boolean
                )

object ProjectUserDeleteResponse {
    /**
     * Creates the codec for converting ProjectUserDeleteResponse from and to JSON.
     */
    implicit val decoder: Decoder[ProjectUserDeleteResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[ProjectUserDeleteResponse] = deriveEncoder
}
