package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ProjectServiceAccountApiKey

/**
 * 
 * @param _object 
 * @param id 
 * @param name 
 * @param role Service accounts can only have one role of type `member`
 * @param createdUnderscoreat 
 * @param apiUnderscorekey 
 */
case class ProjectServiceAccountCreateResponse(_object: String,
                id: String,
                name: String,
                role: String,
                createdUnderscoreat: Int,
                apiUnderscorekey: ProjectServiceAccountApiKey
                )

object ProjectServiceAccountCreateResponse {
    /**
     * Creates the codec for converting ProjectServiceAccountCreateResponse from and to JSON.
     */
    implicit val decoder: Decoder[ProjectServiceAccountCreateResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[ProjectServiceAccountCreateResponse] = deriveEncoder
}
