package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CreateModerationResponse_results_inner.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-16T01:17:28.392125286Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class CreateModerationResponseResultsInner(
  flagged: Boolean,
  categories: CreateModerationResponseResultsInnerCategories,
  categoryScores: CreateModerationResponseResultsInnerCategoryScores
)

object CreateModerationResponseResultsInner {
  implicit lazy val createModerationResponseResultsInnerJsonFormat: Format[CreateModerationResponseResultsInner] = Json.format[CreateModerationResponseResultsInner]
}

