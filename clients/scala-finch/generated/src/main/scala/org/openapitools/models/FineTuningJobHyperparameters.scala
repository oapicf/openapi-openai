package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.FineTuningJobHyperparametersNEpochs

/**
 * The hyperparameters used for the fine-tuning job. See the [fine-tuning guide](/docs/guides/fine-tuning) for more details.
 * @param nUnderscoreepochs 
 */
case class FineTuningJobHyperparameters(nUnderscoreepochs: FineTuningJobHyperparametersNEpochs
                )

object FineTuningJobHyperparameters {
    /**
     * Creates the codec for converting FineTuningJobHyperparameters from and to JSON.
     */
    implicit val decoder: Decoder[FineTuningJobHyperparameters] = deriveDecoder
    implicit val encoder: ObjectEncoder[FineTuningJobHyperparameters] = deriveEncoder
}
