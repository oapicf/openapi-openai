package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.FineTuningJobCheckpointMetrics

/**
 * The `fine_tuning.job.checkpoint` object represents a model checkpoint for a fine-tuning job that is ready to use. 
 * @param id The checkpoint identifier, which can be referenced in the API endpoints.
 * @param createdUnderscoreat The Unix timestamp (in seconds) for when the checkpoint was created.
 * @param fineUnderscoretunedUnderscoremodelUnderscorecheckpoint The name of the fine-tuned checkpoint model that is created.
 * @param stepUnderscorenumber The step number that the checkpoint was created at.
 * @param metrics 
 * @param fineUnderscoretuningUnderscorejobUnderscoreid The name of the fine-tuning job that this checkpoint was created from.
 * @param _object The object type, which is always \"fine_tuning.job.checkpoint\".
 */
case class FineTuningJobCheckpoint(id: String,
                createdUnderscoreat: Int,
                fineUnderscoretunedUnderscoremodelUnderscorecheckpoint: String,
                stepUnderscorenumber: Int,
                metrics: FineTuningJobCheckpointMetrics,
                fineUnderscoretuningUnderscorejobUnderscoreid: String,
                _object: String
                )

object FineTuningJobCheckpoint {
    /**
     * Creates the codec for converting FineTuningJobCheckpoint from and to JSON.
     */
    implicit val decoder: Decoder[FineTuningJobCheckpoint] = deriveDecoder
    implicit val encoder: ObjectEncoder[FineTuningJobCheckpoint] = deriveEncoder
}
