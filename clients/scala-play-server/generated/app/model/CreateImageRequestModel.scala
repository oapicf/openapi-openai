package model

import play.api.libs.json._

/**
  * The model to use for image generation.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:38:29.809972473Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class CreateImageRequestModel(
)

object CreateImageRequestModel {
  implicit lazy val createImageRequestModelJsonFormat: Format[CreateImageRequestModel] = Json.format[CreateImageRequestModel]
}

