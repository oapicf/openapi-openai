package model

import play.api.libs.json._

/**
  * A list of the categories along with their scores as predicted by model.
  * @param hate The score for the category 'hate'.
  * @param hateThreatening The score for the category 'hate/threatening'.
  * @param harassment The score for the category 'harassment'.
  * @param harassmentThreatening The score for the category 'harassment/threatening'.
  * @param selfHarm The score for the category 'self-harm'.
  * @param selfHarmIntent The score for the category 'self-harm/intent'.
  * @param selfHarmInstructions The score for the category 'self-harm/instructions'.
  * @param sexual The score for the category 'sexual'.
  * @param sexualMinors The score for the category 'sexual/minors'.
  * @param violence The score for the category 'violence'.
  * @param violenceGraphic The score for the category 'violence/graphic'.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-04-14T13:53:34.453725706Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class CreateModerationResponseResultsInnerCategoryScores(
  hate: BigDecimal,
  hateThreatening: BigDecimal,
  harassment: BigDecimal,
  harassmentThreatening: BigDecimal,
  selfHarm: BigDecimal,
  selfHarmIntent: BigDecimal,
  selfHarmInstructions: BigDecimal,
  sexual: BigDecimal,
  sexualMinors: BigDecimal,
  violence: BigDecimal,
  violenceGraphic: BigDecimal
)

object CreateModerationResponseResultsInnerCategoryScores {
  implicit lazy val createModerationResponseResultsInnerCategoryScoresJsonFormat: Format[CreateModerationResponseResultsInnerCategoryScores] = Json.format[CreateModerationResponseResultsInnerCategoryScores]
}

