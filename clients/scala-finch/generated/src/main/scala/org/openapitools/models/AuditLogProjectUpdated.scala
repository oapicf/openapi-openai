package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AuditLogProjectUpdatedChangesRequested

/**
 * The details for events with this `type`.
 * @param id The project ID.
 * @param changesUnderscorerequested 
 */
case class AuditLogProjectUpdated(id: Option[String],
                changesUnderscorerequested: Option[AuditLogProjectUpdatedChangesRequested]
                )

object AuditLogProjectUpdated {
    /**
     * Creates the codec for converting AuditLogProjectUpdated from and to JSON.
     */
    implicit val decoder: Decoder[AuditLogProjectUpdated] = deriveDecoder
    implicit val encoder: ObjectEncoder[AuditLogProjectUpdated] = deriveEncoder
}
