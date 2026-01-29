package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Scaling factor for the learning rate. A smaller learning rate may be useful to avoid overfitting. 
 */
case class CreateFineTuningJobRequestHyperparametersLearningRateMultiplier()

object CreateFineTuningJobRequestHyperparametersLearningRateMultiplier {
    /**
     * Creates the codec for converting CreateFineTuningJobRequestHyperparametersLearningRateMultiplier from and to JSON.
     */
    implicit val decoder: Decoder[CreateFineTuningJobRequestHyperparametersLearningRateMultiplier] = deriveDecoder
    implicit val encoder: ObjectEncoder[CreateFineTuningJobRequestHyperparametersLearningRateMultiplier] = deriveEncoder
}
