package org.openapitools.server.model


/**
 * = FineTune =
 *
 * @param id  for example: ''null''
 * @param `object`  for example: ''null''
 * @param createdAt  for example: ''null''
 * @param updatedAt  for example: ''null''
 * @param model  for example: ''null''
 * @param fineTunedModel  for example: ''null''
 * @param organizationId  for example: ''null''
 * @param status  for example: ''null''
 * @param hyperparams  for example: ''null''
 * @param trainingFiles  for example: ''null''
 * @param validationFiles  for example: ''null''
 * @param resultFiles  for example: ''null''
 * @param events  for example: ''null''
*/
final case class FineTune (
  id: String,
  `object`: String,
  createdAt: Int,
  updatedAt: Int,
  model: String,
  fineTunedModel: String,
  organizationId: String,
  status: String,
  hyperparams: Any,
  trainingFiles: Seq[OpenAIFile],
  validationFiles: Seq[OpenAIFile],
  resultFiles: Seq[OpenAIFile],
  events: Option[Seq[FineTuneEvent]] = None
)

