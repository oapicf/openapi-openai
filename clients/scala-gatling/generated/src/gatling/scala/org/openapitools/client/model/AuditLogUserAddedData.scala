
package org.openapitools.client.model


case class AuditLogUserAddedData (
    /* The role of the user. Is either `owner` or `member`. */
    _role: Option[String]
)
object AuditLogUserAddedData {
    def toStringBody(var_role: Object) =
        s"""
        | {
        | "role":$var_role
        | }
        """.stripMargin
}
