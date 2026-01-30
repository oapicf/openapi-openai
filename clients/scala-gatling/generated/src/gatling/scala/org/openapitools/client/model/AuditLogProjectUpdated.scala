
package org.openapitools.client.model


case class AuditLogProjectUpdated (
    /* The project ID. */
    _id: Option[String],
    _changesRequested: Option[AuditLogProjectUpdatedChangesRequested]
)
object AuditLogProjectUpdated {
    def toStringBody(var_id: Object, var_changesRequested: Object) =
        s"""
        | {
        | "id":$var_id,"changesRequested":$var_changesRequested
        | }
        """.stripMargin
}
