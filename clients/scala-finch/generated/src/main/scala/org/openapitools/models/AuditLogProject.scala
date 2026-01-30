package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * The project that the action was scoped to. Absent for actions not scoped to projects.
 * @param id The project ID.
 * @param name The project title.
 */
case class AuditLogProject(id: Option[String],
                name: Option[String]
                )

object AuditLogProject {
    /**
     * Creates the codec for converting AuditLogProject from and to JSON.
     */
    implicit val decoder: Decoder[AuditLogProject] = deriveDecoder
    implicit val encoder: ObjectEncoder[AuditLogProject] = deriveEncoder
}
