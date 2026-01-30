package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * The payload used to update the user.
 * @param role The role of the user. Is either `owner` or `member`.
 */
case class AuditLogUserUpdatedChangesRequested(role: Option[String]
                )

object AuditLogUserUpdatedChangesRequested {
    /**
     * Creates the codec for converting AuditLogUserUpdatedChangesRequested from and to JSON.
     */
    implicit val decoder: Decoder[AuditLogUserUpdatedChangesRequested] = deriveDecoder
    implicit val encoder: ObjectEncoder[AuditLogUserUpdatedChangesRequested] = deriveEncoder
}
