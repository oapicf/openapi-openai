package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param name The updated name of the project, this name appears in reports.
 */
case class ProjectUpdateRequest(name: String
                )

object ProjectUpdateRequest {
    /**
     * Creates the codec for converting ProjectUpdateRequest from and to JSON.
     */
    implicit val decoder: Decoder[ProjectUpdateRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[ProjectUpdateRequest] = deriveEncoder
}
