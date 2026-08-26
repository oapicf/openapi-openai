package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ProjectApiKeyListResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-26T05:22:02.282422614Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ProjectApiKeyListResponse(
  `object`: ProjectApiKeyListResponse.Object.Value,
  data: List[ProjectApiKey],
  firstId: String,
  lastId: String,
  hasMore: Boolean
)

object ProjectApiKeyListResponse {
  implicit lazy val projectApiKeyListResponseJsonFormat: Format[ProjectApiKeyListResponse] = Json.format[ProjectApiKeyListResponse]

  // noinspection TypeAnnotation
  object Object extends Enumeration {
    val List = Value("list")

    type Object = Value
    implicit lazy val ObjectJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

