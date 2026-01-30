package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * The details for events with this `type`.
 * @param id The project ID.
 */
case class AuditLogProjectArchived(id: Option[String]
                )

object AuditLogProjectArchived {
    /**
     * Creates the codec for converting AuditLogProjectArchived from and to JSON.
     */
    implicit val decoder: Decoder[AuditLogProjectArchived] = deriveDecoder
    implicit val encoder: ObjectEncoder[AuditLogProjectArchived] = deriveEncoder
}
