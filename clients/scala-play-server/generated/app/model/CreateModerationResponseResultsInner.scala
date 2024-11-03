package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CreateModerationResponse_results_inner.
  * @param flagged Whether any of the below categories are flagged.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-03T11:15:39.331426426Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class CreateModerationResponseResultsInner(
  flagged: Boolean,
  categories: CreateModerationResponseResultsInnerCategories,
  categoryScores: CreateModerationResponseResultsInnerCategoryScores
)

object CreateModerationResponseResultsInner {
  implicit lazy val createModerationResponseResultsInnerJsonFormat: Format[CreateModerationResponseResultsInner] = Json.format[CreateModerationResponseResultsInner]
}

