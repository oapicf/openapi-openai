package model

import play.api.libs.json._

/**
  * The content that should be matched when generating a model response. If generated tokens would match this content, the entire model response can be returned much more quickly. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:38:29.809972473Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class PredictionContentContent(
)

object PredictionContentContent {
  implicit lazy val predictionContentContentJsonFormat: Format[PredictionContentContent] = Json.format[PredictionContentContent]
}

