package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Represents an individual service account in a project.
 * @param _object The object type, which is always `organization.project.service_account`
 * @param id The identifier, which can be referenced in API endpoints
 * @param name The name of the service account
 * @param role `owner` or `member`
 * @param createdUnderscoreat The Unix timestamp (in seconds) of when the service account was created
 */
case class ProjectServiceAccount(_object: String,
                id: String,
                name: String,
                role: String,
                createdUnderscoreat: Int
                )

object ProjectServiceAccount {
    /**
     * Creates the codec for converting ProjectServiceAccount from and to JSON.
     */
    implicit val decoder: Decoder[ProjectServiceAccount] = deriveDecoder
    implicit val encoder: ObjectEncoder[ProjectServiceAccount] = deriveEncoder
}
