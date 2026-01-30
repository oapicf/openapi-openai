
package org.openapitools.client.model


case class AuditLogServiceAccountUpdated (
    /* The service account ID. */
    _id: Option[String],
    _changesRequested: Option[AuditLogServiceAccountUpdatedChangesRequested]
)
object AuditLogServiceAccountUpdated {
    def toStringBody(var_id: Object, var_changesRequested: Object) =
        s"""
        | {
        | "id":$var_id,"changesRequested":$var_changesRequested
        | }
        """.stripMargin
}
