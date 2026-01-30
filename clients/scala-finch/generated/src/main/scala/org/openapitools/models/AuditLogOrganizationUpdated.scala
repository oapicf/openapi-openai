package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AuditLogOrganizationUpdatedChangesRequested

/**
 * The details for events with this `type`.
 * @param id The organization ID.
 * @param changesUnderscorerequested 
 */
case class AuditLogOrganizationUpdated(id: Option[String],
                changesUnderscorerequested: Option[AuditLogOrganizationUpdatedChangesRequested]
                )

object AuditLogOrganizationUpdated {
    /**
     * Creates the codec for converting AuditLogOrganizationUpdated from and to JSON.
     */
    implicit val decoder: Decoder[AuditLogOrganizationUpdated] = deriveDecoder
    implicit val encoder: ObjectEncoder[AuditLogOrganizationUpdated] = deriveEncoder
}
