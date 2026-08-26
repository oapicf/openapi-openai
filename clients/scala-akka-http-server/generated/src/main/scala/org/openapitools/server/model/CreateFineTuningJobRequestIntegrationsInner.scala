package org.openapitools.server.model


/**
 * @param `type` The type of integration to enable. Currently, only \"wandb\" (Weights and Biases) is supported.  for example: ''null''
 * @param wandb  for example: ''null''
*/
final case class CreateFineTuningJobRequestIntegrationsInner (
  `type`: String,
  wandb: CreateFineTuningJobRequestIntegrationsInnerWandb
)

