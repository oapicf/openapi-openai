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
case class ProjectServiceAccountDeleteResponse(_object: String,
                id: String,
                deleted: Boolean
                )

object ProjectServiceAccountDeleteResponse {
    /**
     * Creates the codec for converting ProjectServiceAccountDeleteResponse from and to JSON.
     */
    implicit val decoder: Decoder[ProjectServiceAccountDeleteResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[ProjectServiceAccountDeleteResponse] = deriveEncoder
}
