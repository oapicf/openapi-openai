package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ListVectorStoreFilesResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-26T05:22:02.282422614Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ListVectorStoreFilesResponse(
  `object`: String,
  data: List[VectorStoreFileObject],
  firstId: String,
  lastId: String,
  hasMore: Boolean
)

object ListVectorStoreFilesResponse {
  implicit lazy val listVectorStoreFilesResponseJsonFormat: Format[ListVectorStoreFilesResponse] = Json.format[ListVectorStoreFilesResponse]
}

