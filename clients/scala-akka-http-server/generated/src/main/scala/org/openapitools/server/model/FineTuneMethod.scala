package org.openapitools.server.model


/**
 * The method used for fine-tuning.
 *
 * @param `type` The type of method. Is either `supervised` or `dpo`. for example: ''null''
 * @param supervised  for example: ''null''
 * @param dpo  for example: ''null''
*/
final case class FineTuneMethod (
  `type`: Option[String] = None,
  supervised: Option[FineTuneSupervisedMethod] = None,
  dpo: Option[FineTuneDPOMethod] = None
)

