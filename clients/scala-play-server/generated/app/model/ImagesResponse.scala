package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ImagesResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-03T11:15:39.331426426Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class ImagesResponse(
  created: Int,
  data: List[Image]
)

object ImagesResponse {
  implicit lazy val imagesResponseJsonFormat: Format[ImagesResponse] = Json.format[ImagesResponse]
}

