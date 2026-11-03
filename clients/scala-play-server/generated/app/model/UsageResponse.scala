package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for UsageResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:38:29.809972473Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class UsageResponse(
  `object`: UsageResponse.Object.Value,
  data: List[UsageTimeBucket],
  hasMore: Boolean,
  nextPage: String
)

object UsageResponse {
  implicit lazy val usageResponseJsonFormat: Format[UsageResponse] = Json.format[UsageResponse]

  // noinspection TypeAnnotation
  object Object extends Enumeration {
    val Page = Value("page")

    type Object = Value
    implicit lazy val ObjectJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

