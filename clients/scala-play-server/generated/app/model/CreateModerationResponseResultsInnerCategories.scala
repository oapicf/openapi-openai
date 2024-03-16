package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CreateModerationResponse_results_inner_categories.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-16T01:17:28.392125286Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class CreateModerationResponseResultsInnerCategories(
  hate: Boolean,
  hateThreatening: Boolean,
  selfHarm: Boolean,
  sexual: Boolean,
  sexualMinors: Boolean,
  violence: Boolean,
  violenceGraphic: Boolean
)

object CreateModerationResponseResultsInnerCategories {
  implicit lazy val createModerationResponseResultsInnerCategoriesJsonFormat: Format[CreateModerationResponseResultsInnerCategories] = Json.format[CreateModerationResponseResultsInnerCategories]
}

