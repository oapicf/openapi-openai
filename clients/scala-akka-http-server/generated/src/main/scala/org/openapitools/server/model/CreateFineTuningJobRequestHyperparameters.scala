package org.openapitools.server.model


/**
 * The hyperparameters used for the fine-tuning job. This value is now deprecated in favor of `method`, and should be passed in under the `method` parameter. 
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

