
package org.openapitools.client.model


case class ListAuditLogsEffectiveAtParameter (
    /* Return only events whose `effective_at` (Unix seconds) is greater than this value. */
    _gt: Option[Integer],
    /* Return only events whose `effective_at` (Unix seconds) is greater than or equal to this value. */
    _gte: Option[Integer],
    /* Return only events whose `effective_at` (Unix seconds) is less than this value. */
    _lt: Option[Integer],
    /* Return only events whose `effective_at` (Unix seconds) is less than or equal to this value. */
    _lte: Option[Integer]
)
object ListAuditLogsEffectiveAtParameter {
    def toStringBody(var_gt: Object, var_gte: Object, var_lt: Object, var_lte: Object) =
        s"""
        | {
        | "gt":$var_gt,"gte":$var_gte,"lt":$var_lt,"lte":$var_lte
        | }
        """.stripMargin
}
