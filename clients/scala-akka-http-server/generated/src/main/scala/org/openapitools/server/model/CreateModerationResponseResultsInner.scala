package org.openapitools.server.model


/**
 * @param flagged  for example: ''null''
 * @param categories  for example: ''null''
 * @param categoryScores  for example: ''null''
*/
final case class CreateModerationResponseResultsInner (
  flagged: Boolean,
  categories: CreateModerationResponseResultsInnerCategories,
  categoryScores: CreateModerationResponseResultsInnerCategoryScores
)

