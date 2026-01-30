package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AuditLogServiceAccountCreatedData

/**
 * The details for events with this `type`.
 * @param id The service account ID.
 * @param data 
 */
case class AuditLogServiceAccountCreated(id: Option[String],
                data: Option[AuditLogServiceAccountCreatedData]
                )

object AuditLogServiceAccountCreated {
    /**
     * Creates the codec for converting AuditLogServiceAccountCreated from and to JSON.
     */
    implicit val decoder: Decoder[AuditLogServiceAccountCreated] = deriveDecoder
    implicit val encoder: ObjectEncoder[AuditLogServiceAccountCreated] = deriveEncoder
}
