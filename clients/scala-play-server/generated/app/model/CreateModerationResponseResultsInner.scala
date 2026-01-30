package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CreateModerationResponse_results_inner.
  * @param flagged Whether any of the below categories are flagged.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CreateModerationResponseResultsInner(
  flagged: Boolean,
  categories: CreateModerationResponseResultsInnerCategories,
  categoryScores: CreateModerationResponseResultsInnerCategoryScores,
  categoryAppliedInputTypes: CreateModerationResponseResultsInnerCategoryAppliedInputTypes
)

object CreateModerationResponseResultsInner {
  implicit lazy val createModerationResponseResultsInnerJsonFormat: Format[CreateModerationResponseResultsInner] = Json.format[CreateModerationResponseResultsInner]
}

