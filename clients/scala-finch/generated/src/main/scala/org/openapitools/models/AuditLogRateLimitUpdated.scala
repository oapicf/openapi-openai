package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AuditLogRateLimitUpdatedChangesRequested

/**
 * The details for events with this `type`.
 * @param id The rate limit ID
 * @param changesUnderscorerequested 
 */
case class AuditLogRateLimitUpdated(id: Option[String],
                changesUnderscorerequested: Option[AuditLogRateLimitUpdatedChangesRequested]
                )

object AuditLogRateLimitUpdated {
    /**
     * Creates the codec for converting AuditLogRateLimitUpdated from and to JSON.
     */
    implicit val decoder: Decoder[AuditLogRateLimitUpdated] = deriveDecoder
    implicit val encoder: ObjectEncoder[AuditLogRateLimitUpdated] = deriveEncoder
}
