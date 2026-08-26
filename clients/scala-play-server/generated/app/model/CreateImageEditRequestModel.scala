package model

import play.api.libs.json._

/**
  * The model to use for image generation. Only `dall-e-2` is supported at this time.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-26T05:22:02.282422614Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CreateImageEditRequestModel(
)

object CreateImageEditRequestModel {
  implicit lazy val createImageEditRequestModelJsonFormat: Format[CreateImageEditRequestModel] = Json.format[CreateImageEditRequestModel]
}

