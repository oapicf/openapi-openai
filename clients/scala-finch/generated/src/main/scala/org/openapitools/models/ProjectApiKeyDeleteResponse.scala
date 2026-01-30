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
case class ProjectApiKeyDeleteResponse(_object: String,
                id: String,
                deleted: Boolean
                )

object ProjectApiKeyDeleteResponse {
    /**
     * Creates the codec for converting ProjectApiKeyDeleteResponse from and to JSON.
     */
    implicit val decoder: Decoder[ProjectApiKeyDeleteResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[ProjectApiKeyDeleteResponse] = deriveEncoder
}
