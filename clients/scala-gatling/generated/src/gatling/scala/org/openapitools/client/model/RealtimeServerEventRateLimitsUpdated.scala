
package org.openapitools.client.model


case class RealtimeServerEventRateLimitsUpdated (
    /* The unique ID of the server event. */
    _eventId: String,
    /* The event type, must be `rate_limits.updated`. */
    _type: String,
    /* List of rate limit information. */
    _rateLimits: List[RealtimeServerEventRateLimitsUpdatedRateLimitsInner]
)
object RealtimeServerEventRateLimitsUpdated {
    def toStringBody(var_eventId: Object, var_type: Object, var_rateLimits: Object) =
        s"""
        | {
        | "eventId":$var_eventId,"type":$var_type,"rateLimits":$var_rateLimits
        | }
        """.stripMargin
}
