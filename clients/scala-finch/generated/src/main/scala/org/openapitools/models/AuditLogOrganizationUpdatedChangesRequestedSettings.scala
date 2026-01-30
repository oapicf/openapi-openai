package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param threadsUnderscoreuiUnderscorevisibility Visibility of the threads page which shows messages created with the Assistants API and Playground. One of `ANY_ROLE`, `OWNERS`, or `NONE`.
 * @param usageUnderscoredashboardUnderscorevisibility Visibility of the usage dashboard which shows activity and costs for your organization. One of `ANY_ROLE` or `OWNERS`.
 */
case class AuditLogOrganizationUpdatedChangesRequestedSettings(threadsUnderscoreuiUnderscorevisibility: Option[String],
                usageUnderscoredashboardUnderscorevisibility: Option[String]
                )

object AuditLogOrganizationUpdatedChangesRequestedSettings {
    /**
     * Creates the codec for converting AuditLogOrganizationUpdatedChangesRequestedSettings from and to JSON.
     */
    implicit val decoder: Decoder[AuditLogOrganizationUpdatedChangesRequestedSettings] = deriveDecoder
    implicit val encoder: ObjectEncoder[AuditLogOrganizationUpdatedChangesRequestedSettings] = deriveEncoder
}
