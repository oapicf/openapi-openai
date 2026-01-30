package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.UsageTimeBucket
import scala.collection.immutable.Seq

/**
 * 
 * @param _object 
 * @param data 
 * @param hasUnderscoremore 
 * @param nextUnderscorepage 
 */
case class UsageResponse(_object: String,
                data: Seq[UsageTimeBucket],
                hasUnderscoremore: Boolean,
                nextUnderscorepage: String
                )

object UsageResponse {
    /**
     * Creates the codec for converting UsageResponse from and to JSON.
     */
    implicit val decoder: Decoder[UsageResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[UsageResponse] = deriveEncoder
}
