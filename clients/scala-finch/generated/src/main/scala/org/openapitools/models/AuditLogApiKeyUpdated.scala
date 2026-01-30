package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AuditLogApiKeyUpdatedChangesRequested

/**
 * The details for events with this `type`.
 * @param id The tracking ID of the API key.
 * @param changesUnderscorerequested 
 */
case class AuditLogApiKeyUpdated(id: Option[String],
                changesUnderscorerequested: Option[AuditLogApiKeyUpdatedChangesRequested]
                )

object AuditLogApiKeyUpdated {
    /**
     * Creates the codec for converting AuditLogApiKeyUpdated from and to JSON.
     */
    implicit val decoder: Decoder[AuditLogApiKeyUpdated] = deriveDecoder
    implicit val encoder: ObjectEncoder[AuditLogApiKeyUpdated] = deriveEncoder
}
