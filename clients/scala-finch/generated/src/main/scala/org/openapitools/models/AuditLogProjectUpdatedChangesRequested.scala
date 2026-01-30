package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * The payload used to update the project.
 * @param title The title of the project as seen on the dashboard.
 */
case class AuditLogProjectUpdatedChangesRequested(title: Option[String]
                )

object AuditLogProjectUpdatedChangesRequested {
    /**
     * Creates the codec for converting AuditLogProjectUpdatedChangesRequested from and to JSON.
     */
    implicit val decoder: Decoder[AuditLogProjectUpdatedChangesRequested] = deriveDecoder
    implicit val encoder: ObjectEncoder[AuditLogProjectUpdatedChangesRequested] = deriveEncoder
}
