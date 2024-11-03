package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * The number of epochs to train the model for. An epoch refers to one full cycle through the training dataset. \"auto\" decides the optimal number of epochs based on the size of the dataset. If setting the number manually, we support any number between 1 and 50 epochs.
 */
case class FineTuningJobHyperparametersNEpochs()

object FineTuningJobHyperparametersNEpochs {
    /**
     * Creates the codec for converting FineTuningJobHyperparametersNEpochs from and to JSON.
     */
    implicit val decoder: Decoder[FineTuningJobHyperparametersNEpochs] = deriveDecoder
    implicit val encoder: ObjectEncoder[FineTuningJobHyperparametersNEpochs] = deriveEncoder
}
