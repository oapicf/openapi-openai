package model

import play.api.libs.json._

/**
  * Emitted at the beginning of a Response to indicate the updated rate limits.  When a Response is created some tokens will be \"reserved\" for the output  tokens, the rate limits shown here reflect that reservation, which is then  adjusted accordingly once the Response is completed. 
  * @param eventId The unique ID of the server event.
  * @param `type` The event type, must be `rate_limits.updated`.
  * @param rateLimits List of rate limit information.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class RealtimeServerEventRateLimitsUpdated(
  eventId: String,
  `type`: RealtimeServerEventRateLimitsUpdated.Type.Value,
  rateLimits: List[RealtimeServerEventRateLimitsUpdatedRateLimitsInner]
)

object RealtimeServerEventRateLimitsUpdated {
  implicit lazy val realtimeServerEventRateLimitsUpdatedJsonFormat: Format[RealtimeServerEventRateLimitsUpdated] = Json.format[RealtimeServerEventRateLimitsUpdated]

  // noinspection TypeAnnotation
  object Type extends Enumeration {
    val RateLimitsUpdated = Value("rate_limits.updated")

    type Type = Value
    implicit lazy val TypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

