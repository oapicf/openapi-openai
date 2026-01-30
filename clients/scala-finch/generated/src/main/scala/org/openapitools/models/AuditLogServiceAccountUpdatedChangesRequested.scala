package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * The payload used to updated the service account.
 * @param role The role of the service account. Is either `owner` or `member`.
 */
case class AuditLogServiceAccountUpdatedChangesRequested(role: Option[String]
                )

object AuditLogServiceAccountUpdatedChangesRequested {
    /**
     * Creates the codec for converting AuditLogServiceAccountUpdatedChangesRequested from and to JSON.
     */
    implicit val decoder: Decoder[AuditLogServiceAccountUpdatedChangesRequested] = deriveDecoder
    implicit val encoder: ObjectEncoder[AuditLogServiceAccountUpdatedChangesRequested] = deriveEncoder
}
