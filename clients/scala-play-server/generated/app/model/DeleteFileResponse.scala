package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for DeleteFileResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-16T01:17:28.392125286Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class DeleteFileResponse(
  id: String,
  `object`: String,
  deleted: Boolean
)

object DeleteFileResponse {
  implicit lazy val deleteFileResponseJsonFormat: Format[DeleteFileResponse] = Json.format[DeleteFileResponse]
}

