package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.InviteProjectsInner
import scala.collection.immutable.Seq

/**
 * Represents an individual `invite` to the organization.
 * @param _object The object type, which is always `organization.invite`
 * @param id The identifier, which can be referenced in API endpoints
 * @param email The email address of the individual to whom the invite was sent
 * @param role `owner` or `reader`
 * @param status `accepted`,`expired`, or `pending`
 * @param invitedUnderscoreat The Unix timestamp (in seconds) of when the invite was sent.
 * @param expiresUnderscoreat The Unix timestamp (in seconds) of when the invite expires.
 * @param acceptedUnderscoreat The Unix timestamp (in seconds) of when the invite was accepted.
 * @param projects The projects that were granted membership upon acceptance of the invite.
 */
case class Invite(_object: String,
                id: String,
                email: String,
                role: String,
                status: String,
                invitedUnderscoreat: Int,
                expiresUnderscoreat: Int,
                acceptedUnderscoreat: Option[Int],
                projects: Option[Seq[InviteProjectsInner]]
                )

object Invite {
    /**
     * Creates the codec for converting Invite from and to JSON.
     */
    implicit val decoder: Decoder[Invite] = deriveDecoder
    implicit val encoder: ObjectEncoder[Invite] = deriveEncoder
}
