
package org.openapitools.client.model


case class AuditLogRateLimitUpdated (
    /* The rate limit ID */
    _id: Option[String],
    _changesRequested: Option[AuditLogRateLimitUpdatedChangesRequested]
)
object AuditLogRateLimitUpdated {
    def toStringBody(var_id: Object, var_changesRequested: Object) =
        s"""
        | {
        | "id":$var_id,"changesRequested":$var_changesRequested
        | }
        """.stripMargin
}
