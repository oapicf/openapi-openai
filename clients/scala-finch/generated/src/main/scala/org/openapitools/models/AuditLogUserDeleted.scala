package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * The details for events with this `type`.
 * @param id The user ID.
 */
case class AuditLogUserDeleted(id: Option[String]
                )

object AuditLogUserDeleted {
    /**
     * Creates the codec for converting AuditLogUserDeleted from and to JSON.
     */
    implicit val decoder: Decoder[AuditLogUserDeleted] = deriveDecoder
    implicit val encoder: ObjectEncoder[AuditLogUserDeleted] = deriveEncoder
}
