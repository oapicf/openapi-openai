package org.openapitools.server.model


/**
 * Emitted at the beginning of a Response to indicate the updated rate limits.  When a Response is created some tokens will be \"reserved\" for the output  tokens, the rate limits shown here reflect that reservation, which is then  adjusted accordingly once the Response is completed. 
 *
 * @param eventId The unique ID of the server event. for example: ''null''
 * @param `type` The event type, must be `rate_limits.updated`. for example: ''null''
 * @param rateLimits List of rate limit information. for example: ''null''
*/
final case class RealtimeServerEventRateLimitsUpdated (
  eventId: String,
  `type`: String,
  rateLimits: Seq[RealtimeServerEventRateLimitsUpdatedRateLimitsInner]
)

