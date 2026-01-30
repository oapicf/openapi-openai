package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ProjectRateLimitUpdateRequest.
  * @param maxRequestsPer1Minute The maximum requests per minute.
  * @param maxTokensPer1Minute The maximum tokens per minute.
  * @param maxImagesPer1Minute The maximum images per minute. Only relevant for certain models.
  * @param maxAudioMegabytesPer1Minute The maximum audio megabytes per minute. Only relevant for certain models.
  * @param maxRequestsPer1Day The maximum requests per day. Only relevant for certain models.
  * @param batch1DayMaxInputTokens The maximum batch input tokens per day. Only relevant for certain models.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class ProjectRateLimitUpdateRequest(
  maxRequestsPer1Minute: Option[Int],
  maxTokensPer1Minute: Option[Int],
  maxImagesPer1Minute: Option[Int],
  maxAudioMegabytesPer1Minute: Option[Int],
  maxRequestsPer1Day: Option[Int],
  batch1DayMaxInputTokens: Option[Int]
)

object ProjectRateLimitUpdateRequest {
  implicit lazy val projectRateLimitUpdateRequestJsonFormat: Format[ProjectRateLimitUpdateRequest] = Json.format[ProjectRateLimitUpdateRequest]
}

