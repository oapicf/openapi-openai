package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * The details for events with this `type`.
 * @param id The service account ID.
 */
case class AuditLogServiceAccountDeleted(id: Option[String]
                )

object AuditLogServiceAccountDeleted {
    /**
     * Creates the codec for converting AuditLogServiceAccountDeleted from and to JSON.
     */
    implicit val decoder: Decoder[AuditLogServiceAccountDeleted] = deriveDecoder
    implicit val encoder: ObjectEncoder[AuditLogServiceAccountDeleted] = deriveEncoder
}
