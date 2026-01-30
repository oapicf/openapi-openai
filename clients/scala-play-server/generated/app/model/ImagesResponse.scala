package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ImagesResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class ImagesResponse(
  created: Int,
  data: List[Image]
)

object ImagesResponse {
  implicit lazy val imagesResponseJsonFormat: Format[ImagesResponse] = Json.format[ImagesResponse]
}

