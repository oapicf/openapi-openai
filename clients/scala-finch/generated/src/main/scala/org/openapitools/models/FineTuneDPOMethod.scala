package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.FineTuneDPOMethodHyperparameters

/**
 * Configuration for the DPO fine-tuning method.
 * @param hyperparameters 
 */
case class FineTuneDPOMethod(hyperparameters: Option[FineTuneDPOMethodHyperparameters]
                )

object FineTuneDPOMethod {
    /**
     * Creates the codec for converting FineTuneDPOMethod from and to JSON.
     */
    implicit val decoder: Decoder[FineTuneDPOMethod] = deriveDecoder
    implicit val encoder: ObjectEncoder[FineTuneDPOMethod] = deriveEncoder
}
