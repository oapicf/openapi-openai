package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.FineTuneSupervisedMethodHyperparameters

/**
 * Configuration for the supervised fine-tuning method.
 * @param hyperparameters 
 */
case class FineTuneSupervisedMethod(hyperparameters: Option[FineTuneSupervisedMethodHyperparameters]
                )

object FineTuneSupervisedMethod {
    /**
     * Creates the codec for converting FineTuneSupervisedMethod from and to JSON.
     */
    implicit val decoder: Decoder[FineTuneSupervisedMethod] = deriveDecoder
    implicit val encoder: ObjectEncoder[FineTuneSupervisedMethod] = deriveEncoder
}
