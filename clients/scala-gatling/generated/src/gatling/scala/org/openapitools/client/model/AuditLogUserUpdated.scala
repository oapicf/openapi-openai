
package org.openapitools.client.model


case class AuditLogUserUpdated (
    /* The project ID. */
    _id: Option[String],
    _changesRequested: Option[AuditLogUserUpdatedChangesRequested]
)
object AuditLogUserUpdated {
    def toStringBody(var_id: Object, var_changesRequested: Object) =
        s"""
        | {
        | "id":$var_id,"changesRequested":$var_changesRequested
        | }
        """.stripMargin
}
