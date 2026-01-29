package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BigDecimal

/**
 * Metrics at the step number during the fine-tuning job.
 * @param step 
 * @param trainUnderscoreloss 
 * @param trainUnderscoremeanUnderscoretokenUnderscoreaccuracy 
 * @param validUnderscoreloss 
 * @param validUnderscoremeanUnderscoretokenUnderscoreaccuracy 
 * @param fullUnderscorevalidUnderscoreloss 
 * @param fullUnderscorevalidUnderscoremeanUnderscoretokenUnderscoreaccuracy 
 */
case class FineTuningJobCheckpointMetrics(step: Option[BigDecimal],
                trainUnderscoreloss: Option[BigDecimal],
                trainUnderscoremeanUnderscoretokenUnderscoreaccuracy: Option[BigDecimal],
                validUnderscoreloss: Option[BigDecimal],
                validUnderscoremeanUnderscoretokenUnderscoreaccuracy: Option[BigDecimal],
                fullUnderscorevalidUnderscoreloss: Option[BigDecimal],
                fullUnderscorevalidUnderscoremeanUnderscoretokenUnderscoreaccuracy: Option[BigDecimal]
                )

object FineTuningJobCheckpointMetrics {
    /**
     * Creates the codec for converting FineTuningJobCheckpointMetrics from and to JSON.
     */
    implicit val decoder: Decoder[FineTuningJobCheckpointMetrics] = deriveDecoder
    implicit val encoder: ObjectEncoder[FineTuningJobCheckpointMetrics] = deriveEncoder
}
