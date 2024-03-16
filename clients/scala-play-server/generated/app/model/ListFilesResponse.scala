package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ListFilesResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-16T01:17:28.392125286Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class ListFilesResponse(
  `object`: String,
  data: List[OpenAIFile]
)

object ListFilesResponse {
  implicit lazy val listFilesResponseJsonFormat: Format[ListFilesResponse] = Json.format[ListFilesResponse]
}
