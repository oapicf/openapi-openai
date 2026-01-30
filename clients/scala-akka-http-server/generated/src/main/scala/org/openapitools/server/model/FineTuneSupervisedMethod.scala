package org.openapitools.server.model


/**
 * Configuration for the supervised fine-tuning method.
 *
 * @param hyperparameters  for example: ''null''
*/
final case class FineTuneSupervisedMethod (
  hyperparameters: Option[FineTuneSupervisedMethodHyperparameters] = None
)

