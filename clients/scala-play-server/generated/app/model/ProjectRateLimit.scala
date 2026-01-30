package model

import play.api.libs.json._

/**
  * Represents a project rate limit config.
  * @param `object` The object type, which is always `project.rate_limit`
  * @param id The identifier, which can be referenced in API endpoints.
  * @param model The model this rate limit applies to.
  * @param maxRequestsPer1Minute The maximum requests per minute.
  * @param maxTokensPer1Minute The maximum tokens per minute.
  * @param maxImagesPer1Minute The maximum images per minute. Only present for relevant models.
  * @param maxAudioMegabytesPer1Minute The maximum audio megabytes per minute. Only present for relevant models.
  * @param maxRequestsPer1Day The maximum requests per day. Only present for relevant models.
  * @param batch1DayMaxInputTokens The maximum batch input tokens per day. Only present for relevant models.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class ProjectRateLimit(
  `object`: ProjectRateLimit.Object.Value,
  id: String,
  model: String,
  maxRequestsPer1Minute: Int,
  maxTokensPer1Minute: Int,
  maxImagesPer1Minute: Option[Int],
  maxAudioMegabytesPer1Minute: Option[Int],
  maxRequestsPer1Day: Option[Int],
  batch1DayMaxInputTokens: Option[Int]
)

object ProjectRateLimit {
  implicit lazy val projectRateLimitJsonFormat: Format[ProjectRateLimit] = Json.format[ProjectRateLimit]

  // noinspection TypeAnnotation
  object Object extends Enumeration {
    val ProjectRateLimit = Value("project.rate_limit")

    type Object = Value
    implicit lazy val ObjectJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

