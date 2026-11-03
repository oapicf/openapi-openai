package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for RealtimeServerEventRateLimitsUpdated_rate_limits_inner.
  * @param name The name of the rate limit (`requests`, `tokens`). 
  * @param limit The maximum allowed value for the rate limit.
  * @param remaining The remaining value before the limit is reached.
  * @param resetSeconds Seconds until the rate limit resets.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:38:29.809972473Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class RealtimeServerEventRateLimitsUpdatedRateLimitsInner(
  name: Option[RealtimeServerEventRateLimitsUpdatedRateLimitsInner.Name.Value],
  limit: Option[Int],
  remaining: Option[Int],
  resetSeconds: Option[BigDecimal]
)

object RealtimeServerEventRateLimitsUpdatedRateLimitsInner {
  implicit lazy val realtimeServerEventRateLimitsUpdatedRateLimitsInnerJsonFormat: Format[RealtimeServerEventRateLimitsUpdatedRateLimitsInner] = Json.format[RealtimeServerEventRateLimitsUpdatedRateLimitsInner]

  // noinspection TypeAnnotation
  object Name extends Enumeration {
    val Requests = Value("requests")
    val Tokens = Value("tokens")

    type Name = Value
    implicit lazy val NameJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

