package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * The details for events with this `type`.
 * @param id The ID of the invite.
 */
case class AuditLogInviteAccepted(id: Option[String]
                )

object AuditLogInviteAccepted {
    /**
     * Creates the codec for converting AuditLogInviteAccepted from and to JSON.
     */
    implicit val decoder: Decoder[AuditLogInviteAccepted] = deriveDecoder
    implicit val encoder: ObjectEncoder[AuditLogInviteAccepted] = deriveEncoder
}
