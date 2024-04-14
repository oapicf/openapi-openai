package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ListRunStepsResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-04-14T13:53:34.453725706Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class ListRunStepsResponse(
  `object`: String,
  data: List[RunStepObject],
  firstId: String,
  lastId: String,
  hasMore: Boolean
)

object ListRunStepsResponse {
  implicit lazy val listRunStepsResponseJsonFormat: Format[ListRunStepsResponse] = Json.format[ListRunStepsResponse]
}

