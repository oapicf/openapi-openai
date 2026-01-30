package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for UsageResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
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

