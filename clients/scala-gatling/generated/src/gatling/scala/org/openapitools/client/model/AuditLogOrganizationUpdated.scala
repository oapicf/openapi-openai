
package org.openapitools.client.model


case class AuditLogOrganizationUpdated (
    /* The organization ID. */
    _id: Option[String],
    _changesRequested: Option[AuditLogOrganizationUpdatedChangesRequested]
)
object AuditLogOrganizationUpdated {
    def toStringBody(var_id: Object, var_changesRequested: Object) =
        s"""
        | {
        | "id":$var_id,"changesRequested":$var_changesRequested
        | }
        """.stripMargin
}
