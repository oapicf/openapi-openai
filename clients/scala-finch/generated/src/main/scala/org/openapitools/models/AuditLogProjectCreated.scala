package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AuditLogProjectCreatedData

/**
 * The details for events with this `type`.
 * @param id The project ID.
 * @param data 
 */
case class AuditLogProjectCreated(id: Option[String],
                data: Option[AuditLogProjectCreatedData]
                )

object AuditLogProjectCreated {
    /**
     * Creates the codec for converting AuditLogProjectCreated from and to JSON.
     */
    implicit val decoder: Decoder[AuditLogProjectCreated] = deriveDecoder
    implicit val encoder: ObjectEncoder[AuditLogProjectCreated] = deriveEncoder
}
