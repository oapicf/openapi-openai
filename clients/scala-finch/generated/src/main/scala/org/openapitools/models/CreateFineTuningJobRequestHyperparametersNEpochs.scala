package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * The number of epochs to train the model for. An epoch refers to one full cycle through the training dataset. 
 */
case class CreateFineTuningJobRequestHyperparametersNEpochs()

object CreateFineTuningJobRequestHyperparametersNEpochs {
    /**
     * Creates the codec for converting CreateFineTuningJobRequestHyperparametersNEpochs from and to JSON.
     */
    implicit val decoder: Decoder[CreateFineTuningJobRequestHyperparametersNEpochs] = deriveDecoder
    implicit val encoder: ObjectEncoder[CreateFineTuningJobRequestHyperparametersNEpochs] = deriveEncoder
}
