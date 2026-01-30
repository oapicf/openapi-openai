package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ProjectServiceAccount
import scala.collection.immutable.Seq

/**
 * 
 * @param _object 
 * @param data 
 * @param firstUnderscoreid 
 * @param lastUnderscoreid 
 * @param hasUnderscoremore 
 */
case class ProjectServiceAccountListResponse(_object: String,
                data: Seq[ProjectServiceAccount],
                firstUnderscoreid: String,
                lastUnderscoreid: String,
                hasUnderscoremore: Boolean
                )

object ProjectServiceAccountListResponse {
    /**
     * Creates the codec for converting ProjectServiceAccountListResponse from and to JSON.
     */
    implicit val decoder: Decoder[ProjectServiceAccountListResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[ProjectServiceAccountListResponse] = deriveEncoder
}
