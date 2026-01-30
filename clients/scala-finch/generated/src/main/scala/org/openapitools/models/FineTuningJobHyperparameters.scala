package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CreateFineTuningJobRequestHyperparametersBatchSize
import org.openapitools.models.CreateFineTuningJobRequestHyperparametersLearningRateMultiplier
import org.openapitools.models.CreateFineTuningJobRequestHyperparametersNEpochs

/**
 * The hyperparameters used for the fine-tuning job. This value will only be returned when running `supervised` jobs.
 * @param batchUnderscoresize 
 * @param learningUnderscorerateUnderscoremultiplier 
 * @param nUnderscoreepochs 
 */
case class FineTuningJobHyperparameters(batchUnderscoresize: Option[CreateFineTuningJobRequestHyperparametersBatchSize],
                learningUnderscorerateUnderscoremultiplier: Option[CreateFineTuningJobRequestHyperparametersLearningRateMultiplier],
                nUnderscoreepochs: Option[CreateFineTuningJobRequestHyperparametersNEpochs]
                )

object FineTuningJobHyperparameters {
    /**
     * Creates the codec for converting FineTuningJobHyperparameters from and to JSON.
     */
    implicit val decoder: Decoder[FineTuningJobHyperparameters] = deriveDecoder
    implicit val encoder: ObjectEncoder[FineTuningJobHyperparameters] = deriveEncoder
}
