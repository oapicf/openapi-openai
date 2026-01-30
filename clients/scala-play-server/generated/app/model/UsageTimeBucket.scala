package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for UsageTimeBucket.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class UsageTimeBucket(
  `object`: UsageTimeBucket.Object.Value,
  startTime: Int,
  endTime: Int,
  result: List[UsageTimeBucketResultInner]
)

object UsageTimeBucket {
  implicit lazy val usageTimeBucketJsonFormat: Format[UsageTimeBucket] = Json.format[UsageTimeBucket]

  // noinspection TypeAnnotation
  object Object extends Enumeration {
    val Bucket = Value("bucket")

    type Object = Value
    implicit lazy val ObjectJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

