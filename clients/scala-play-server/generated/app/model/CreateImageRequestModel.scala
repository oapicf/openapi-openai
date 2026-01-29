package model

import play.api.libs.json._

/**
  * The model to use for image generation.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T10:48:27.489746113Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CreateImageRequestModel(
)

object CreateImageRequestModel {
  implicit lazy val createImageRequestModelJsonFormat: Format[CreateImageRequestModel] = Json.format[CreateImageRequestModel]
}

