package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CostsResultAmount

/**
 * The aggregated costs details of the specific time bucket.
 * @param _object 
 * @param amount 
 * @param lineUnderscoreitem When `group_by=line_item`, this field provides the line item of the grouped costs result.
 * @param projectUnderscoreid When `group_by=project_id`, this field provides the project ID of the grouped costs result.
 */
case class CostsResult(_object: String,
                amount: Option[CostsResultAmount],
                lineUnderscoreitem: Option[String],
                projectUnderscoreid: Option[String]
                )

object CostsResult {
    /**
     * Creates the codec for converting CostsResult from and to JSON.
     */
    implicit val decoder: Decoder[CostsResult] = deriveDecoder
    implicit val encoder: ObjectEncoder[CostsResult] = deriveEncoder
}
