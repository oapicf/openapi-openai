package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Represents an individual project.
 * @param id The identifier, which can be referenced in API endpoints
 * @param _object The object type, which is always `organization.project`
 * @param name The name of the project. This appears in reporting.
 * @param createdUnderscoreat The Unix timestamp (in seconds) of when the project was created.
 * @param archivedUnderscoreat The Unix timestamp (in seconds) of when the project was archived or `null`.
 * @param status `active` or `archived`
 */
case class Project(id: String,
                _object: String,
                name: String,
                createdUnderscoreat: Int,
                archivedUnderscoreat: Option[Int],
                status: String
                )

object Project {
    /**
     * Creates the codec for converting Project from and to JSON.
     */
    implicit val decoder: Decoder[Project] = deriveDecoder
    implicit val encoder: ObjectEncoder[Project] = deriveEncoder
}
