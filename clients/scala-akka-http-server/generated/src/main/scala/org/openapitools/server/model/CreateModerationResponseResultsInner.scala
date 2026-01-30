package org.openapitools.server.model


/**
 * @param flagged Whether any of the below categories are flagged. for example: ''null''
 * @param categories  for example: ''null''
 * @param categoryScores  for example: ''null''
 * @param categoryAppliedInputTypes  for example: ''null''
*/
final case class CreateModerationResponseResultsInner (
  flagged: Boolean,
  categories: CreateModerationResponseResultsInnerCategories,
  categoryScores: CreateModerationResponseResultsInnerCategoryScores,
  categoryAppliedInputTypes: CreateModerationResponseResultsInnerCategoryAppliedInputTypes
)

