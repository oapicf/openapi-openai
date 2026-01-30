package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ListBatchesResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class ListBatchesResponse(
  data: List[Batch],
  firstId: Option[String],
  lastId: Option[String],
  hasMore: Boolean,
  `object`: ListBatchesResponse.Object.Value
)

object ListBatchesResponse {
  implicit lazy val listBatchesResponseJsonFormat: Format[ListBatchesResponse] = Json.format[ListBatchesResponse]

  // noinspection TypeAnnotation
  object Object extends Enumeration {
    val List = Value("list")

    type Object = Value
    implicit lazy val ObjectJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

