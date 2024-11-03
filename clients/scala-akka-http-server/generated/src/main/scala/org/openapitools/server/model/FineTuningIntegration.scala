package org.openapitools.server.model


/**
 * = Fine-Tuning Job Integration =
 *
 * @param `type` The type of the integration being enabled for the fine-tuning job for example: ''null''
 * @param wandb  for example: ''null''
*/
final case class FineTuningIntegration (
  `type`: String,
  wandb: CreateFineTuningJobRequestIntegrationsInnerWandb
)

