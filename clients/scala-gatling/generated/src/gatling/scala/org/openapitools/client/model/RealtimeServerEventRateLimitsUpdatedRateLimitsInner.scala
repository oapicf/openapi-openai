
package org.openapitools.client.model


case class RealtimeServerEventRateLimitsUpdatedRateLimitsInner (
    /* The name of the rate limit (`requests`, `tokens`).  */
    _name: Option[String],
    /* The maximum allowed value for the rate limit. */
    _limit: Option[Integer],
    /* The remaining value before the limit is reached. */
    _remaining: Option[Integer],
    /* Seconds until the rate limit resets. */
    _resetSeconds: Option[Number]
)
object RealtimeServerEventRateLimitsUpdatedRateLimitsInner {
    def toStringBody(var_name: Object, var_limit: Object, var_remaining: Object, var_resetSeconds: Object) =
        s"""
        | {
        | "name":$var_name,"limit":$var_limit,"remaining":$var_remaining,"resetSeconds":$var_resetSeconds
        | }
        """.stripMargin
}
