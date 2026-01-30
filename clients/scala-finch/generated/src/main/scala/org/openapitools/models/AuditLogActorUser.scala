package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * The user who performed the audit logged action.
 * @param id The user id.
 * @param email The user email.
 */
case class AuditLogActorUser(id: Option[String],
                email: Option[String]
                )

object AuditLogActorUser {
    /**
     * Creates the codec for converting AuditLogActorUser from and to JSON.
     */
    implicit val decoder: Decoder[AuditLogActorUser] = deriveDecoder
    implicit val encoder: ObjectEncoder[AuditLogActorUser] = deriveEncoder
}
