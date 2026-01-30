
package org.openapitools.client.model


case class AuditLogUserUpdatedChangesRequested (
    /* The role of the user. Is either `owner` or `member`. */
    _role: Option[String]
)
object AuditLogUserUpdatedChangesRequested {
    def toStringBody(var_role: Object) =
        s"""
        | {
        | "role":$var_role
        | }
        """.stripMargin
}
