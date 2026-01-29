package org.openapitools.server.model


/**
 * Metrics at the step number during the fine-tuning job.
 *
 * @param step  for example: ''null''
 * @param trainLoss  for example: ''null''
 * @param trainMeanTokenAccuracy  for example: ''null''
 * @param validLoss  for example: ''null''
 * @param validMeanTokenAccuracy  for example: ''null''
 * @param fullValidLoss  for example: ''null''
 * @param fullValidMeanTokenAccuracy  for example: ''null''
*/
final case class FineTuningJobCheckpointMetrics (
  step: Option[Double] = None,
  trainLoss: Option[Double] = None,
  trainMeanTokenAccuracy: Option[Double] = None,
  validLoss: Option[Double] = None,
  validMeanTokenAccuracy: Option[Double] = None,
  fullValidLoss: Option[Double] = None,
  fullValidMeanTokenAccuracy: Option[Double] = None
)

