package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * The details for events with this `type`.
 * @param id The rate limit ID
 */
case class AuditLogRateLimitDeleted(id: Option[String]
                )

object AuditLogRateLimitDeleted {
    /**
     * Creates the codec for converting AuditLogRateLimitDeleted from and to JSON.
     */
    implicit val decoder: Decoder[AuditLogRateLimitDeleted] = deriveDecoder
    implicit val encoder: ObjectEncoder[AuditLogRateLimitDeleted] = deriveEncoder
}
