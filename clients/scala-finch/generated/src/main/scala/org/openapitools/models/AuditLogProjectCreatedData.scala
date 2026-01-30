package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * The payload used to create the project.
 * @param name The project name.
 * @param title The title of the project as seen on the dashboard.
 */
case class AuditLogProjectCreatedData(name: Option[String],
                title: Option[String]
                )

object AuditLogProjectCreatedData {
    /**
     * Creates the codec for converting AuditLogProjectCreatedData from and to JSON.
     */
    implicit val decoder: Decoder[AuditLogProjectCreatedData] = deriveDecoder
    implicit val encoder: ObjectEncoder[AuditLogProjectCreatedData] = deriveEncoder
}
