package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ListMessagesResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-03T11:15:39.331426426Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class ListMessagesResponse(
  `object`: String,
  data: List[MessageObject],
  firstId: String,
  lastId: String,
  hasMore: Boolean
)

object ListMessagesResponse {
  implicit lazy val listMessagesResponseJsonFormat: Format[ListMessagesResponse] = Json.format[ListMessagesResponse]
}

