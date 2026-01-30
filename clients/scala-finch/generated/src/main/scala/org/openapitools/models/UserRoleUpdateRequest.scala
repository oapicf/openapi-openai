package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param role `owner` or `reader`
 */
case class UserRoleUpdateRequest(role: String
                )

object UserRoleUpdateRequest {
    /**
     * Creates the codec for converting UserRoleUpdateRequest from and to JSON.
     */
    implicit val decoder: Decoder[UserRoleUpdateRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[UserRoleUpdateRequest] = deriveEncoder
}
