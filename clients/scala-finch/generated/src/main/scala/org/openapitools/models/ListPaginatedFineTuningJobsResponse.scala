package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.FineTuningJob
import scala.collection.immutable.Seq

/**
 * 
 * @param data 
 * @param hasUnderscoremore 
 * @param _object 
 */
case class ListPaginatedFineTuningJobsResponse(data: Seq[FineTuningJob],
                hasUnderscoremore: Boolean,
                _object: String
                )

object ListPaginatedFineTuningJobsResponse {
    /**
     * Creates the codec for converting ListPaginatedFineTuningJobsResponse from and to JSON.
     */
    implicit val decoder: Decoder[ListPaginatedFineTuningJobsResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[ListPaginatedFineTuningJobsResponse] = deriveEncoder
}
