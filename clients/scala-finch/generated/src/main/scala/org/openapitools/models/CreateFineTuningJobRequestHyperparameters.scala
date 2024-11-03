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
 * The hyperparameters used for the fine-tuning job.
 * @param batchUnderscoresize 
 * @param learningUnderscorerateUnderscoremultiplier 
 * @param nUnderscoreepochs 
 */
case class CreateFineTuningJobRequestHyperparameters(batchUnderscoresize: Option[CreateFineTuningJobRequestHyperparametersBatchSize],
                learningUnderscorerateUnderscoremultiplier: Option[CreateFineTuningJobRequestHyperparametersLearningRateMultiplier],
                nUnderscoreepochs: Option[CreateFineTuningJobRequestHyperparametersNEpochs]
                )

object CreateFineTuningJobRequestHyperparameters {
    /**
     * Creates the codec for converting CreateFineTuningJobRequestHyperparameters from and to JSON.
     */
    implicit val decoder: Decoder[CreateFineTuningJobRequestHyperparameters] = deriveDecoder
    implicit val encoder: ObjectEncoder[CreateFineTuningJobRequestHyperparameters] = deriveEncoder
}
