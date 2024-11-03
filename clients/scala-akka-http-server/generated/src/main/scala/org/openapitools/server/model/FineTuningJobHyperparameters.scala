package org.openapitools.server.model


/**
 * The hyperparameters used for the fine-tuning job. See the [fine-tuning guide](/docs/guides/fine-tuning) for more details.
 *
 * @param nEpochs  for example: ''null''
*/
final case class FineTuningJobHyperparameters (
  nEpochs: FineTuningJobHyperparametersNEpochs
)

