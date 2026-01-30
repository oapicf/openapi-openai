package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param _object The object type, which is always `organization.project.service_account.api_key`
 * @param value 
 * @param name 
 * @param createdUnderscoreat 
 * @param id 
 */
case class ProjectServiceAccountApiKey(_object: String,
                value: String,
                name: String,
                createdUnderscoreat: Int,
                id: String
                )

object ProjectServiceAccountApiKey {
    /**
     * Creates the codec for converting ProjectServiceAccountApiKey from and to JSON.
     */
    implicit val decoder: Decoder[ProjectServiceAccountApiKey] = deriveDecoder
    implicit val encoder: ObjectEncoder[ProjectServiceAccountApiKey] = deriveEncoder
}
