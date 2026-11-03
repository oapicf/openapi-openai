package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ImagesResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:38:29.809972473Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class ImagesResponse(
  created: Int,
  data: List[Image]
)

object ImagesResponse {
  implicit lazy val imagesResponseJsonFormat: Format[ImagesResponse] = Json.format[ImagesResponse]
}

