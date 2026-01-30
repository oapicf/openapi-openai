package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.Invite
import scala.collection.immutable.Seq

/**
 * 
 * @param _object The object type, which is always `list`
 * @param data 
 * @param firstUnderscoreid The first `invite_id` in the retrieved `list`
 * @param lastUnderscoreid The last `invite_id` in the retrieved `list`
 * @param hasUnderscoremore The `has_more` property is used for pagination to indicate there are additional results.
 */
case class InviteListResponse(_object: String,
                data: Seq[Invite],
                firstUnderscoreid: Option[String],
                lastUnderscoreid: Option[String],
                hasUnderscoremore: Option[Boolean]
                )

object InviteListResponse {
    /**
     * Creates the codec for converting InviteListResponse from and to JSON.
     */
    implicit val decoder: Decoder[InviteListResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[InviteListResponse] = deriveEncoder
}
