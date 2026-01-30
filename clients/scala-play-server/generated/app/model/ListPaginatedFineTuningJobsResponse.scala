package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ListPaginatedFineTuningJobsResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class ListPaginatedFineTuningJobsResponse(
  data: List[FineTuningJob],
  hasMore: Boolean,
  `object`: ListPaginatedFineTuningJobsResponse.Object.Value
)

object ListPaginatedFineTuningJobsResponse {
  implicit lazy val listPaginatedFineTuningJobsResponseJsonFormat: Format[ListPaginatedFineTuningJobsResponse] = Json.format[ListPaginatedFineTuningJobsResponse]

  // noinspection TypeAnnotation
  object Object extends Enumeration {
    val List = Value("list")

    type Object = Value
    implicit lazy val ObjectJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

