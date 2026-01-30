package model

import play.api.libs.json._

/**
  * The content that should be matched when generating a model response. If generated tokens would match this content, the entire model response can be returned much more quickly. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class PredictionContentContent(
)

object PredictionContentContent {
  implicit lazy val predictionContentContentJsonFormat: Format[PredictionContentContent] = Json.format[PredictionContentContent]
}

