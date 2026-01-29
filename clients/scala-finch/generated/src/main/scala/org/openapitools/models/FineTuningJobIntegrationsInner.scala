package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CreateFineTuningJobRequestIntegrationsInnerWandb
import org.openapitools.models.FineTuningIntegration

/**
 * 
 * @param _type The type of the integration being enabled for the fine-tuning job
 * @param wandb 
 */
case class FineTuningJobIntegrationsInner(_type: String,
                wandb: CreateFineTuningJobRequestIntegrationsInnerWandb
                )

object FineTuningJobIntegrationsInner {
    /**
     * Creates the codec for converting FineTuningJobIntegrationsInner from and to JSON.
     */
    implicit val decoder: Decoder[FineTuningJobIntegrationsInner] = deriveDecoder
    implicit val encoder: ObjectEncoder[FineTuningJobIntegrationsInner] = deriveEncoder
}
