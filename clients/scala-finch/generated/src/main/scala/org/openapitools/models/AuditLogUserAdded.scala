package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AuditLogUserAddedData

/**
 * The details for events with this `type`.
 * @param id The user ID.
 * @param data 
 */
case class AuditLogUserAdded(id: Option[String],
                data: Option[AuditLogUserAddedData]
                )

object AuditLogUserAdded {
    /**
     * Creates the codec for converting AuditLogUserAdded from and to JSON.
     */
    implicit val decoder: Decoder[AuditLogUserAdded] = deriveDecoder
    implicit val encoder: ObjectEncoder[AuditLogUserAdded] = deriveEncoder
}
