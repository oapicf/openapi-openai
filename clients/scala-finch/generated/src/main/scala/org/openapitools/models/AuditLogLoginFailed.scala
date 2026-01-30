package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * The details for events with this `type`.
 * @param errorUnderscorecode The error code of the failure.
 * @param errorUnderscoremessage The error message of the failure.
 */
case class AuditLogLoginFailed(errorUnderscorecode: Option[String],
                errorUnderscoremessage: Option[String]
                )

object AuditLogLoginFailed {
    /**
     * Creates the codec for converting AuditLogLoginFailed from and to JSON.
     */
    implicit val decoder: Decoder[AuditLogLoginFailed] = deriveDecoder
    implicit val encoder: ObjectEncoder[AuditLogLoginFailed] = deriveEncoder
}
