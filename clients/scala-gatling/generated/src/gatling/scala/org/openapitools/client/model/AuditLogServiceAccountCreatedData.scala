
package org.openapitools.client.model


case class AuditLogServiceAccountCreatedData (
    /* The role of the service account. Is either `owner` or `member`. */
    _role: Option[String]
)
object AuditLogServiceAccountCreatedData {
    def toStringBody(var_role: Object) =
        s"""
        | {
        | "role":$var_role
        | }
        """.stripMargin
}
