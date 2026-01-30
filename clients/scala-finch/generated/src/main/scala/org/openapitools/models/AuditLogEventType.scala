package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * The event type.
 */
case class AuditLogEventType()

object AuditLogEventType {
    /**
     * Creates the codec for converting AuditLogEventType from and to JSON.
     */
    implicit val decoder: Decoder[AuditLogEventType] = deriveDecoder
    implicit val encoder: ObjectEncoder[AuditLogEventType] = deriveEncoder
}
