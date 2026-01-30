package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ProjectUser
import scala.collection.immutable.Seq

/**
 * 
 * @param _object 
 * @param data 
 * @param firstUnderscoreid 
 * @param lastUnderscoreid 
 * @param hasUnderscoremore 
 */
case class ProjectUserListResponse(_object: String,
                data: Seq[ProjectUser],
                firstUnderscoreid: String,
                lastUnderscoreid: String,
                hasUnderscoremore: Boolean
                )

object ProjectUserListResponse {
    /**
     * Creates the codec for converting ProjectUserListResponse from and to JSON.
     */
    implicit val decoder: Decoder[ProjectUserListResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[ProjectUserListResponse] = deriveEncoder
}
