
package org.openapitools.client.model


case class InviteRequest (
    /* Send an email to this address */
    _email: String,
    /* `owner` or `reader` */
    _role: String,
    /* An array of projects to which membership is granted at the same time the org invite is accepted. If omitted, the user will be invited to the default project for compatibility with legacy behavior. */
    _projects: Option[List[InviteRequestProjectsInner]]
)
object InviteRequest {
    def toStringBody(var_email: Object, var_role: Object, var_projects: Object) =
        s"""
        | {
        | "email":$var_email,"role":$var_role,"projects":$var_projects
        | }
        """.stripMargin
}
