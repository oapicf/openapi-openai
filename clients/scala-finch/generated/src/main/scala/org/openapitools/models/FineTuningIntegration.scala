package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CreateFineTuningJobRequestIntegrationsInnerWandb

/**
 * 
 * @param _type The type of the integration being enabled for the fine-tuning job
 * @param wandb 
 */
case class FineTuningIntegration(_type: String,
                wandb: CreateFineTuningJobRequestIntegrationsInnerWandb
                )

object FineTuningIntegration {
    /**
     * Creates the codec for converting FineTuningIntegration from and to JSON.
     */
    implicit val decoder: Decoder[FineTuningIntegration] = deriveDecoder
    implicit val encoder: ObjectEncoder[FineTuningIntegration] = deriveEncoder
}
