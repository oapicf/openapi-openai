package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * The payload used to create the invite.
 * @param email The email invited to the organization.
 * @param role The role the email was invited to be. Is either `owner` or `member`.
 */
case class AuditLogInviteSentData(email: Option[String],
                role: Option[String]
                )

object AuditLogInviteSentData {
    /**
     * Creates the codec for converting AuditLogInviteSentData from and to JSON.
     */
    implicit val decoder: Decoder[AuditLogInviteSentData] = deriveDecoder
    implicit val encoder: ObjectEncoder[AuditLogInviteSentData] = deriveEncoder
}
