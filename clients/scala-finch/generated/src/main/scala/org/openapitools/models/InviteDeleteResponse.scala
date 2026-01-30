package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param _object The object type, which is always `organization.invite.deleted`
 * @param id 
 * @param deleted 
 */
case class InviteDeleteResponse(_object: String,
                id: String,
                deleted: Boolean
                )

object InviteDeleteResponse {
    /**
     * Creates the codec for converting InviteDeleteResponse from and to JSON.
     */
    implicit val decoder: Decoder[InviteDeleteResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[InviteDeleteResponse] = deriveEncoder
}
