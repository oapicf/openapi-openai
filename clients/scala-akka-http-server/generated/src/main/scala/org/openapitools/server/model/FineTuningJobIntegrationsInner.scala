package org.openapitools.server.model


/**
 * @param `type` The type of the integration being enabled for the fine-tuning job for example: ''null''
 * @param wandb  for example: ''null''
*/
final case class FineTuningJobIntegrationsInner (
  `type`: String,
  wandb: CreateFineTuningJobRequestIntegrationsInnerWandb
)

