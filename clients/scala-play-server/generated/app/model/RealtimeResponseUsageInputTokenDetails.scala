package model

import play.api.libs.json._

/**
  * Details about the input tokens used in the Response.
  * @param cachedTokens The number of cached tokens used in the Response.
  * @param textTokens The number of text tokens used in the Response.
  * @param audioTokens The number of audio tokens used in the Response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class RealtimeResponseUsageInputTokenDetails(
  cachedTokens: Option[Int],
  textTokens: Option[Int],
  audioTokens: Option[Int]
)

object RealtimeResponseUsageInputTokenDetails {
  implicit lazy val realtimeResponseUsageInputTokenDetailsJsonFormat: Format[RealtimeResponseUsageInputTokenDetails] = Json.format[RealtimeResponseUsageInputTokenDetails]
}

