package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * The type of integration to enable. Currently, only \"wandb\" (Weights and Biases) is supported. 
 */
case class CreateFineTuningJobRequestIntegrationsInnerType()

object CreateFineTuningJobRequestIntegrationsInnerType {
    /**
     * Creates the codec for converting CreateFineTuningJobRequestIntegrationsInnerType from and to JSON.
     */
    implicit val decoder: Decoder[CreateFineTuningJobRequestIntegrationsInnerType] = deriveDecoder
    implicit val encoder: ObjectEncoder[CreateFineTuningJobRequestIntegrationsInnerType] = deriveEncoder
}
