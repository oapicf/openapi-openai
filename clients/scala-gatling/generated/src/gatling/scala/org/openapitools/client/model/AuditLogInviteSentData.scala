
package org.openapitools.client.model


case class AuditLogInviteSentData (
    /* The email invited to the organization. */
    _email: Option[String],
    /* The role the email was invited to be. Is either `owner` or `member`. */
    _role: Option[String]
)
object AuditLogInviteSentData {
    def toStringBody(var_email: Object, var_role: Object) =
        s"""
        | {
        | "email":$var_email,"role":$var_role
        | }
        """.stripMargin
}
