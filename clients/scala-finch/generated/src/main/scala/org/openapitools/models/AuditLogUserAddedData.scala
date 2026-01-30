package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * The payload used to add the user to the project.
 * @param role The role of the user. Is either `owner` or `member`.
 */
case class AuditLogUserAddedData(role: Option[String]
                )

object AuditLogUserAddedData {
    /**
     * Creates the codec for converting AuditLogUserAddedData from and to JSON.
     */
    implicit val decoder: Decoder[AuditLogUserAddedData] = deriveDecoder
    implicit val encoder: ObjectEncoder[AuditLogUserAddedData] = deriveEncoder
}
