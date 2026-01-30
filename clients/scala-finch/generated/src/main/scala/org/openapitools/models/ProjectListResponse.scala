package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.Project
import scala.collection.immutable.Seq

/**
 * 
 * @param _object 
 * @param data 
 * @param firstUnderscoreid 
 * @param lastUnderscoreid 
 * @param hasUnderscoremore 
 */
case class ProjectListResponse(_object: String,
                data: Seq[Project],
                firstUnderscoreid: String,
                lastUnderscoreid: String,
                hasUnderscoremore: Boolean
                )

object ProjectListResponse {
    /**
     * Creates the codec for converting ProjectListResponse from and to JSON.
     */
    implicit val decoder: Decoder[ProjectListResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[ProjectListResponse] = deriveEncoder
}
