package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * The aggregated vector stores usage details of the specific time bucket.
 * @param _object 
 * @param usageUnderscorebytes The vector stores usage in bytes.
 * @param projectUnderscoreid When `group_by=project_id`, this field provides the project ID of the grouped usage result.
 */
case class UsageVectorStoresResult(_object: String,
                usageUnderscorebytes: Int,
                projectUnderscoreid: Option[String]
                )

object UsageVectorStoresResult {
    /**
     * Creates the codec for converting UsageVectorStoresResult from and to JSON.
     */
    implicit val decoder: Decoder[UsageVectorStoresResult] = deriveDecoder
    implicit val encoder: ObjectEncoder[UsageVectorStoresResult] = deriveEncoder
}
