package model

import play.api.libs.json._

/**
  * The model to use for image generation.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-03T11:15:39.331426426Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class CreateImageRequestModel(
)

object CreateImageRequestModel {
  implicit lazy val createImageRequestModelJsonFormat: Format[CreateImageRequestModel] = Json.format[CreateImageRequestModel]
}

