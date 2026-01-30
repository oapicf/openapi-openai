package org.openapitools.server.model


/**
 * The hyperparameters used for the fine-tuning job.
 *
 * @param batchSize  for example: ''null''
 * @param learningRateMultiplier  for example: ''null''
 * @param nEpochs  for example: ''null''
*/
final case class FineTuneSupervisedMethodHyperparameters (
  batchSize: Option[FineTuneDPOMethodHyperparametersBatchSize] = None,
  learningRateMultiplier: Option[FineTuneDPOMethodHyperparametersLearningRateMultiplier] = None,
  nEpochs: Option[FineTuneDPOMethodHyperparametersNEpochs] = None
)

