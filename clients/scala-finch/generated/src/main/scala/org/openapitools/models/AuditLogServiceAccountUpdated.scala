package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AuditLogServiceAccountUpdatedChangesRequested

/**
 * The details for events with this `type`.
 * @param id The service account ID.
 * @param changesUnderscorerequested 
 */
case class AuditLogServiceAccountUpdated(id: Option[String],
                changesUnderscorerequested: Option[AuditLogServiceAccountUpdatedChangesRequested]
                )

object AuditLogServiceAccountUpdated {
    /**
     * Creates the codec for converting AuditLogServiceAccountUpdated from and to JSON.
     */
    implicit val decoder: Decoder[AuditLogServiceAccountUpdated] = deriveDecoder
    implicit val encoder: ObjectEncoder[AuditLogServiceAccountUpdated] = deriveEncoder
}
