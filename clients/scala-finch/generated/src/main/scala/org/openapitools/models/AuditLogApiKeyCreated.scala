package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AuditLogApiKeyCreatedData

/**
 * The details for events with this `type`.
 * @param id The tracking ID of the API key.
 * @param data 
 */
case class AuditLogApiKeyCreated(id: Option[String],
                data: Option[AuditLogApiKeyCreatedData]
                )

object AuditLogApiKeyCreated {
    /**
     * Creates the codec for converting AuditLogApiKeyCreated from and to JSON.
     */
    implicit val decoder: Decoder[AuditLogApiKeyCreated] = deriveDecoder
    implicit val encoder: ObjectEncoder[AuditLogApiKeyCreated] = deriveEncoder
}
