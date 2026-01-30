package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AuditLogUserUpdatedChangesRequested

/**
 * The details for events with this `type`.
 * @param id The project ID.
 * @param changesUnderscorerequested 
 */
case class AuditLogUserUpdated(id: Option[String],
                changesUnderscorerequested: Option[AuditLogUserUpdatedChangesRequested]
                )

object AuditLogUserUpdated {
    /**
     * Creates the codec for converting AuditLogUserUpdated from and to JSON.
     */
    implicit val decoder: Decoder[AuditLogUserUpdated] = deriveDecoder
    implicit val encoder: ObjectEncoder[AuditLogUserUpdated] = deriveEncoder
}
