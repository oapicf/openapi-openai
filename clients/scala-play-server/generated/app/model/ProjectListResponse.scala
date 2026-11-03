package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ProjectListResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:38:29.809972473Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class ProjectListResponse(
  `object`: ProjectListResponse.Object.Value,
  data: List[Project],
  firstId: String,
  lastId: String,
  hasMore: Boolean
)

object ProjectListResponse {
  implicit lazy val projectListResponseJsonFormat: Format[ProjectListResponse] = Json.format[ProjectListResponse]

  // noinspection TypeAnnotation
  object Object extends Enumeration {
    val List = Value("list")

    type Object = Value
    implicit lazy val ObjectJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

