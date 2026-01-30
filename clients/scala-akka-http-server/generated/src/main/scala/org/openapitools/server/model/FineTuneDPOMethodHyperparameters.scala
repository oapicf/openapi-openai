package org.openapitools.server.model


/**
 * The hyperparameters used for the fine-tuning job.
 *
 * @param beta  for example: ''null''
 * @param batchSize  for example: ''null''
 * @param learningRateMultiplier  for example: ''null''
 * @param nEpochs  for example: ''null''
*/
final case class FineTuneDPOMethodHyperparameters (
  beta: Option[FineTuneDPOMethodHyperparametersBeta] = None,
  batchSize: Option[FineTuneDPOMethodHyperparametersBatchSize] = None,
  learningRateMultiplier: Option[FineTuneDPOMethodHyperparametersLearningRateMultiplier] = None,
  nEpochs: Option[FineTuneDPOMethodHyperparametersNEpochs] = None
)

