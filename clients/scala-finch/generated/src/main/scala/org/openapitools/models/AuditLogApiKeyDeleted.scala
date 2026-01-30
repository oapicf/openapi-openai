package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * The details for events with this `type`.
 * @param id The tracking ID of the API key.
 */
case class AuditLogApiKeyDeleted(id: Option[String]
                )

object AuditLogApiKeyDeleted {
    /**
     * Creates the codec for converting AuditLogApiKeyDeleted from and to JSON.
     */
    implicit val decoder: Decoder[AuditLogApiKeyDeleted] = deriveDecoder
    implicit val encoder: ObjectEncoder[AuditLogApiKeyDeleted] = deriveEncoder
}
