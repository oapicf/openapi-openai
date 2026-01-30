package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.FineTuneDPOMethodHyperparametersBatchSize
import org.openapitools.models.FineTuneDPOMethodHyperparametersLearningRateMultiplier
import org.openapitools.models.FineTuneDPOMethodHyperparametersNEpochs

/**
 * The hyperparameters used for the fine-tuning job.
 * @param batchUnderscoresize 
 * @param learningUnderscorerateUnderscoremultiplier 
 * @param nUnderscoreepochs 
 */
case class FineTuneSupervisedMethodHyperparameters(batchUnderscoresize: Option[FineTuneDPOMethodHyperparametersBatchSize],
                learningUnderscorerateUnderscoremultiplier: Option[FineTuneDPOMethodHyperparametersLearningRateMultiplier],
                nUnderscoreepochs: Option[FineTuneDPOMethodHyperparametersNEpochs]
                )

object FineTuneSupervisedMethodHyperparameters {
    /**
     * Creates the codec for converting FineTuneSupervisedMethodHyperparameters from and to JSON.
     */
    implicit val decoder: Decoder[FineTuneSupervisedMethodHyperparameters] = deriveDecoder
    implicit val encoder: ObjectEncoder[FineTuneSupervisedMethodHyperparameters] = deriveEncoder
}
