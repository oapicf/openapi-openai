
package org.openapitools.client.model


case class Invite (
    /* The object type, which is always `organization.invite` */
    _object: String,
    /* The identifier, which can be referenced in API endpoints */
    _id: String,
    /* The email address of the individual to whom the invite was sent */
    _email: String,
    /* `owner` or `reader` */
    _role: String,
    /* `accepted`,`expired`, or `pending` */
    _status: String,
    /* The Unix timestamp (in seconds) of when the invite was sent. */
    _invitedAt: Integer,
    /* The Unix timestamp (in seconds) of when the invite expires. */
    _expiresAt: Integer,
    /* The Unix timestamp (in seconds) of when the invite was accepted. */
    _acceptedAt: Option[Integer],
    /* The projects that were granted membership upon acceptance of the invite. */
    _projects: Option[List[InviteProjectsInner]]
)
object Invite {
    def toStringBody(var_object: Object, var_id: Object, var_email: Object, var_role: Object, var_status: Object, var_invitedAt: Object, var_expiresAt: Object, var_acceptedAt: Object, var_projects: Object) =
        s"""
        | {
        | "object":$var_object,"id":$var_id,"email":$var_email,"role":$var_role,"status":$var_status,"invitedAt":$var_invitedAt,"expiresAt":$var_expiresAt,"acceptedAt":$var_acceptedAt,"projects":$var_projects
        | }
        """.stripMargin
}
