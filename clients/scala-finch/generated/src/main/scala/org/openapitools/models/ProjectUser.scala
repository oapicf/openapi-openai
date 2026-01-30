package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Represents an individual user in a project.
 * @param _object The object type, which is always `organization.project.user`
 * @param id The identifier, which can be referenced in API endpoints
 * @param name The name of the user
 * @param email The email address of the user
 * @param role `owner` or `member`
 * @param addedUnderscoreat The Unix timestamp (in seconds) of when the project was added.
 */
case class ProjectUser(_object: String,
                id: String,
                name: String,
                email: String,
                role: String,
                addedUnderscoreat: Int
                )

object ProjectUser {
    /**
     * Creates the codec for converting ProjectUser from and to JSON.
     */
    implicit val decoder: Decoder[ProjectUser] = deriveDecoder
    implicit val encoder: ObjectEncoder[ProjectUser] = deriveEncoder
}
