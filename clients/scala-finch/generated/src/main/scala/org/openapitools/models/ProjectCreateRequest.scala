package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param name The friendly name of the project, this name appears in reports.
 */
case class ProjectCreateRequest(name: String
                )

object ProjectCreateRequest {
    /**
     * Creates the codec for converting ProjectCreateRequest from and to JSON.
     */
    implicit val decoder: Decoder[ProjectCreateRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[ProjectCreateRequest] = deriveEncoder
}
