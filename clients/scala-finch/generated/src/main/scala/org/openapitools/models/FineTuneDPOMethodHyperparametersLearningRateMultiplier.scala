package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Scaling factor for the learning rate. A smaller learning rate may be useful to avoid overfitting. 
 */
case class FineTuneDPOMethodHyperparametersLearningRateMultiplier()

object FineTuneDPOMethodHyperparametersLearningRateMultiplier {
    /**
     * Creates the codec for converting FineTuneDPOMethodHyperparametersLearningRateMultiplier from and to JSON.
     */
    implicit val decoder: Decoder[FineTuneDPOMethodHyperparametersLearningRateMultiplier] = deriveDecoder
    implicit val encoder: ObjectEncoder[FineTuneDPOMethodHyperparametersLearningRateMultiplier] = deriveEncoder
}
