package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param name The name of the service account being created.
 */
case class ProjectServiceAccountCreateRequest(name: String
                )

object ProjectServiceAccountCreateRequest {
    /**
     * Creates the codec for converting ProjectServiceAccountCreateRequest from and to JSON.
     */
    implicit val decoder: Decoder[ProjectServiceAccountCreateRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[ProjectServiceAccountCreateRequest] = deriveEncoder
}
