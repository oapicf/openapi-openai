package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * The number of epochs to train the model for. An epoch refers to one full cycle through the training dataset. 
 */
case class FineTuneDPOMethodHyperparametersNEpochs()

object FineTuneDPOMethodHyperparametersNEpochs {
    /**
     * Creates the codec for converting FineTuneDPOMethodHyperparametersNEpochs from and to JSON.
     */
    implicit val decoder: Decoder[FineTuneDPOMethodHyperparametersNEpochs] = deriveDecoder
    implicit val encoder: ObjectEncoder[FineTuneDPOMethodHyperparametersNEpochs] = deriveEncoder
}
