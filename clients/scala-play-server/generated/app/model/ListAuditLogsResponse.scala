package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ListAuditLogsResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class ListAuditLogsResponse(
  `object`: ListAuditLogsResponse.Object.Value,
  data: List[AuditLog],
  firstId: String,
  lastId: String,
  hasMore: Boolean
)

object ListAuditLogsResponse {
  implicit lazy val listAuditLogsResponseJsonFormat: Format[ListAuditLogsResponse] = Json.format[ListAuditLogsResponse]

  // noinspection TypeAnnotation
  object Object extends Enumeration {
    val List = Value("list")

    type Object = Value
    implicit lazy val ObjectJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

