package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ListRunStepsResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T10:48:27.489746113Z[Etc/UTC]", comments = "Generator version: 7.18.0")
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

