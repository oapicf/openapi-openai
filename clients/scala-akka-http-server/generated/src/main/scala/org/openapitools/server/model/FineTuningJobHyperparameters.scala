package org.openapitools.server.model


/**
 * The hyperparameters used for the fine-tuning job. This value will only be returned when running `supervised` jobs.
 *
 * @param batchSize  for example: ''null''
 * @param learningRateMultiplier  for example: ''null''
 * @param nEpochs  for example: ''null''
*/
final case class FineTuningJobHyperparameters (
  batchSize: Option[CreateFineTuningJobRequestHyperparametersBatchSize] = None,
  learningRateMultiplier: Option[CreateFineTuningJobRequestHyperparametersLearningRateMultiplier] = None,
  nEpochs: Option[CreateFineTuningJobRequestHyperparametersNEpochs] = None
)

