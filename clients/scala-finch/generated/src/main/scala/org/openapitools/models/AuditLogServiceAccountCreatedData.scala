package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * The payload used to create the service account.
 * @param role The role of the service account. Is either `owner` or `member`.
 */
case class AuditLogServiceAccountCreatedData(role: Option[String]
                )

object AuditLogServiceAccountCreatedData {
    /**
     * Creates the codec for converting AuditLogServiceAccountCreatedData from and to JSON.
     */
    implicit val decoder: Decoder[AuditLogServiceAccountCreatedData] = deriveDecoder
    implicit val encoder: ObjectEncoder[AuditLogServiceAccountCreatedData] = deriveEncoder
}
