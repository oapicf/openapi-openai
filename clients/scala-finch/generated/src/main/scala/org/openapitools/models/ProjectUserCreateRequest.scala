package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param userUnderscoreid The ID of the user.
 * @param role `owner` or `member`
 */
case class ProjectUserCreateRequest(userUnderscoreid: String,
                role: String
                )

object ProjectUserCreateRequest {
    /**
     * Creates the codec for converting ProjectUserCreateRequest from and to JSON.
     */
    implicit val decoder: Decoder[ProjectUserCreateRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[ProjectUserCreateRequest] = deriveEncoder
}
