package org.openapitools.server.model


/**
 * @param name The name of the rate limit (`requests`, `tokens`).  for example: ''null''
 * @param limit The maximum allowed value for the rate limit. for example: ''null''
 * @param remaining The remaining value before the limit is reached. for example: ''null''
 * @param resetSeconds Seconds until the rate limit resets. for example: ''null''
*/
final case class RealtimeServerEventRateLimitsUpdatedRateLimitsInner (
  name: Option[String] = None,
  limit: Option[Int] = None,
  remaining: Option[Int] = None,
  resetSeconds: Option[Double] = None
)

