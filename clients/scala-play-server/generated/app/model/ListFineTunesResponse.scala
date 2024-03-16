package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ListFineTunesResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-16T01:17:28.392125286Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class ListFineTunesResponse(
  `object`: String,
  data: List[FineTune]
)

object ListFineTunesResponse {
  implicit lazy val listFineTunesResponseJsonFormat: Format[ListFineTunesResponse] = Json.format[ListFineTunesResponse]
}

