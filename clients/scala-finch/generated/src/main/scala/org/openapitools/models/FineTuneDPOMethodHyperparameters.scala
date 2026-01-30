package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.FineTuneDPOMethodHyperparametersBatchSize
import org.openapitools.models.FineTuneDPOMethodHyperparametersBeta
import org.openapitools.models.FineTuneDPOMethodHyperparametersLearningRateMultiplier
import org.openapitools.models.FineTuneDPOMethodHyperparametersNEpochs

/**
 * The hyperparameters used for the fine-tuning job.
 * @param beta 
 * @param batchUnderscoresize 
 * @param learningUnderscorerateUnderscoremultiplier 
 * @param nUnderscoreepochs 
 */
case class FineTuneDPOMethodHyperparameters(beta: Option[FineTuneDPOMethodHyperparametersBeta],
                batchUnderscoresize: Option[FineTuneDPOMethodHyperparametersBatchSize],
                learningUnderscorerateUnderscoremultiplier: Option[FineTuneDPOMethodHyperparametersLearningRateMultiplier],
                nUnderscoreepochs: Option[FineTuneDPOMethodHyperparametersNEpochs]
                )

object FineTuneDPOMethodHyperparameters {
    /**
     * Creates the codec for converting FineTuneDPOMethodHyperparameters from and to JSON.
     */
    implicit val decoder: Decoder[FineTuneDPOMethodHyperparameters] = deriveDecoder
    implicit val encoder: ObjectEncoder[FineTuneDPOMethodHyperparameters] = deriveEncoder
}
