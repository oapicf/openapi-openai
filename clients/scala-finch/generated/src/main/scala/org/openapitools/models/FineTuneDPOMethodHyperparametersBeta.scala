package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * The beta value for the DPO method. A higher beta value will increase the weight of the penalty between the policy and reference model. 
 */
case class FineTuneDPOMethodHyperparametersBeta()

object FineTuneDPOMethodHyperparametersBeta {
    /**
     * Creates the codec for converting FineTuneDPOMethodHyperparametersBeta from and to JSON.
     */
    implicit val decoder: Decoder[FineTuneDPOMethodHyperparametersBeta] = deriveDecoder
    implicit val encoder: ObjectEncoder[FineTuneDPOMethodHyperparametersBeta] = deriveEncoder
}
