
package org.openapitools.client.model


case class AuditLogServiceAccountUpdatedChangesRequested (
    /* The role of the service account. Is either `owner` or `member`. */
    _role: Option[String]
)
object AuditLogServiceAccountUpdatedChangesRequested {
    def toStringBody(var_role: Object) =
        s"""
        | {
        | "role":$var_role
        | }
        """.stripMargin
}
