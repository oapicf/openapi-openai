package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * The aggregated code interpreter sessions usage details of the specific time bucket.
 * @param _object 
 * @param sessions The number of code interpreter sessions.
 * @param projectUnderscoreid When `group_by=project_id`, this field provides the project ID of the grouped usage result.
 */
case class UsageCodeInterpreterSessionsResult(_object: String,
                sessions: Int,
                projectUnderscoreid: Option[String]
                )

object UsageCodeInterpreterSessionsResult {
    /**
     * Creates the codec for converting UsageCodeInterpreterSessionsResult from and to JSON.
     */
    implicit val decoder: Decoder[UsageCodeInterpreterSessionsResult] = deriveDecoder
    implicit val encoder: ObjectEncoder[UsageCodeInterpreterSessionsResult] = deriveEncoder
}
