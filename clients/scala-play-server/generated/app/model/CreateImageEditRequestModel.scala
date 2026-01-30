package model

import play.api.libs.json._

/**
  * The model to use for image generation. Only `dall-e-2` is supported at this time.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CreateImageEditRequestModel(
)

object CreateImageEditRequestModel {
  implicit lazy val createImageEditRequestModelJsonFormat: Format[CreateImageEditRequestModel] = Json.format[CreateImageEditRequestModel]
}

