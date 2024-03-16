package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ListFineTuneEventsResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-16T01:17:28.392125286Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class ListFineTuneEventsResponse(
  `object`: String,
  data: List[FineTuneEvent]
)

object ListFineTuneEventsResponse {
  implicit lazy val listFineTuneEventsResponseJsonFormat: Format[ListFineTuneEventsResponse] = Json.format[ListFineTuneEventsResponse]
}

