package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ProjectRateLimit
import scala.collection.immutable.Seq

/**
 * 
 * @param _object 
 * @param data 
 * @param firstUnderscoreid 
 * @param lastUnderscoreid 
 * @param hasUnderscoremore 
 */
case class ProjectRateLimitListResponse(_object: String,
                data: Seq[ProjectRateLimit],
                firstUnderscoreid: String,
                lastUnderscoreid: String,
                hasUnderscoremore: Boolean
                )

object ProjectRateLimitListResponse {
    /**
     * Creates the codec for converting ProjectRateLimitListResponse from and to JSON.
     */
    implicit val decoder: Decoder[ProjectRateLimitListResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[ProjectRateLimitListResponse] = deriveEncoder
}
