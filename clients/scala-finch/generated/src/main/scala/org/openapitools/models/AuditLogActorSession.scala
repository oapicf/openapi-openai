package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AuditLogActorUser

/**
 * The session in which the audit logged action was performed.
 * @param user 
 * @param ipUnderscoreaddress The IP address from which the action was performed.
 */
case class AuditLogActorSession(user: Option[AuditLogActorUser],
                ipUnderscoreaddress: Option[String]
                )

object AuditLogActorSession {
    /**
     * Creates the codec for converting AuditLogActorSession from and to JSON.
     */
    implicit val decoder: Decoder[AuditLogActorSession] = deriveDecoder
    implicit val encoder: ObjectEncoder[AuditLogActorSession] = deriveEncoder
}
