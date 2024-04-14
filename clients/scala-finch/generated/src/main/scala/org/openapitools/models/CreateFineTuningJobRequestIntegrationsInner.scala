package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CreateFineTuningJobRequestIntegrationsInnerType
import org.openapitools.models.CreateFineTuningJobRequestIntegrationsInnerWandb

/**
 * 
 * @param _type 
 * @param wandb 
 */
case class CreateFineTuningJobRequestIntegrationsInner(_type: CreateFineTuningJobRequestIntegrationsInnerType,
                wandb: CreateFineTuningJobRequestIntegrationsInnerWandb
                )

object CreateFineTuningJobRequestIntegrationsInner {
    /**
     * Creates the codec for converting CreateFineTuningJobRequestIntegrationsInner from and to JSON.
     */
    implicit val decoder: Decoder[CreateFineTuningJobRequestIntegrationsInner] = deriveDecoder
    implicit val encoder: ObjectEncoder[CreateFineTuningJobRequestIntegrationsInner] = deriveEncoder
}
