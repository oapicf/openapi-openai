package org.openapitools.server.model


/**
 * Configuration for the DPO fine-tuning method.
 *
 * @param hyperparameters  for example: ''null''
*/
final case class FineTuneDPOMethod (
  hyperparameters: Option[FineTuneDPOMethodHyperparameters] = None
)

