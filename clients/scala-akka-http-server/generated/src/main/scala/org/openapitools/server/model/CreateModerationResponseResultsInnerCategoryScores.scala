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
final case class CreateModerationResponseResultsInnerCategoryScores (
  hate: Double,
  hateThreatening: Double,
  selfHarm: Double,
  sexual: Double,
  sexualMinors: Double,
  violence: Double,
  violenceGraphic: Double
)

