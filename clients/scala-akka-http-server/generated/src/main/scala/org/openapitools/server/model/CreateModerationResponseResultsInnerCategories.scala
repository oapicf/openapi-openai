package org.openapitools.server.model


/**
 * @param hate  for example: ''null''
 * @param hateThreatening  for example: ''null''
 * @param selfHarm  for example: ''null''
 * @param sexual  for example: ''null''
 * @param sexualMinors  for example: ''null''
 * @param violence  for example: ''null''
 * @param violenceGraphic  for example: ''null''
*/
final case class CreateModerationResponseResultsInnerCategories (
  hate: Boolean,
  hateThreatening: Boolean,
  selfHarm: Boolean,
  sexual: Boolean,
  sexualMinors: Boolean,
  violence: Boolean,
  violenceGraphic: Boolean
)

