package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CreateModerationResponse_results_inner.
  * @param flagged Whether any of the below categories are flagged.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T10:48:27.489746113Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CreateModerationResponseResultsInner(
  flagged: Boolean,
  categories: CreateModerationResponseResultsInnerCategories,
  categoryScores: CreateModerationResponseResultsInnerCategoryScores
)

object CreateModerationResponseResultsInner {
  implicit lazy val createModerationResponseResultsInnerJsonFormat: Format[CreateModerationResponseResultsInner] = Json.format[CreateModerationResponseResultsInner]
}

