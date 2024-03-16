package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CreateModerationResponse_results_inner_category_scores.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-16T01:17:28.392125286Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class CreateModerationResponseResultsInnerCategoryScores(
  hate: BigDecimal,
  hateThreatening: BigDecimal,
  selfHarm: BigDecimal,
  sexual: BigDecimal,
  sexualMinors: BigDecimal,
  violence: BigDecimal,
  violenceGraphic: BigDecimal
)

object CreateModerationResponseResultsInnerCategoryScores {
  implicit lazy val createModerationResponseResultsInnerCategoryScoresJsonFormat: Format[CreateModerationResponseResultsInnerCategoryScores] = Json.format[CreateModerationResponseResultsInnerCategoryScores]
}

