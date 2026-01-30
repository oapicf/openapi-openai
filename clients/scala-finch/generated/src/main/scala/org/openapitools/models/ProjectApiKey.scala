package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ProjectApiKeyOwner

/**
 * Represents an individual API key in a project.
 * @param _object The object type, which is always `organization.project.api_key`
 * @param redactedUnderscorevalue The redacted value of the API key
 * @param name The name of the API key
 * @param createdUnderscoreat The Unix timestamp (in seconds) of when the API key was created
 * @param id The identifier, which can be referenced in API endpoints
 * @param owner 
 */
case class ProjectApiKey(_object: String,
                redactedUnderscorevalue: String,
                name: String,
                createdUnderscoreat: Int,
                id: String,
                owner: ProjectApiKeyOwner
                )

object ProjectApiKey {
    /**
     * Creates the codec for converting ProjectApiKey from and to JSON.
     */
    implicit val decoder: Decoder[ProjectApiKey] = deriveDecoder
    implicit val encoder: ObjectEncoder[ProjectApiKey] = deriveEncoder
}
