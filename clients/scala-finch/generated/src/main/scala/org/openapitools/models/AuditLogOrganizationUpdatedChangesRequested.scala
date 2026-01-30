package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AuditLogOrganizationUpdatedChangesRequestedSettings

/**
 * The payload used to update the organization settings.
 * @param title The organization title.
 * @param description The organization description.
 * @param name The organization name.
 * @param settings 
 */
case class AuditLogOrganizationUpdatedChangesRequested(title: Option[String],
                description: Option[String],
                name: Option[String],
                settings: Option[AuditLogOrganizationUpdatedChangesRequestedSettings]
                )

object AuditLogOrganizationUpdatedChangesRequested {
    /**
     * Creates the codec for converting AuditLogOrganizationUpdatedChangesRequested from and to JSON.
     */
    implicit val decoder: Decoder[AuditLogOrganizationUpdatedChangesRequested] = deriveDecoder
    implicit val encoder: ObjectEncoder[AuditLogOrganizationUpdatedChangesRequested] = deriveEncoder
}
