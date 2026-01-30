package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AuditLogInviteSentData

/**
 * The details for events with this `type`.
 * @param id The ID of the invite.
 * @param data 
 */
case class AuditLogInviteSent(id: Option[String],
                data: Option[AuditLogInviteSentData]
                )

object AuditLogInviteSent {
    /**
     * Creates the codec for converting AuditLogInviteSent from and to JSON.
     */
    implicit val decoder: Decoder[AuditLogInviteSent] = deriveDecoder
    implicit val encoder: ObjectEncoder[AuditLogInviteSent] = deriveEncoder
}
