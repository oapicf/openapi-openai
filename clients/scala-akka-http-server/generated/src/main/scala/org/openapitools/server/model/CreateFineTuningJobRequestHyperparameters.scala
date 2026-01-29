package org.openapitools.server.model


/**
 * The hyperparameters used for the fine-tuning job.
 *
 * @param batchSize  for example: ''null''
 * @param learningRateMultiplier  for example: ''null''
 * @param nEpochs  for example: ''null''
*/
final case class CreateFineTuningJobRequestHyperparameters (
  batchSize: Option[CreateFineTuningJobRequestHyperparametersBatchSize] = None,
  learningRateMultiplier: Option[CreateFineTuningJobRequestHyperparametersLearningRateMultiplier] = None,
  nEpochs: Option[CreateFineTuningJobRequestHyperparametersNEpochs] = None
)

