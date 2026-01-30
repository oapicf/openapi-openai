
package org.openapitools.client.model


case class ProjectUser (
    /* The object type, which is always `organization.project.user` */
    _object: String,
    /* The identifier, which can be referenced in API endpoints */
    _id: String,
    /* The name of the user */
    _name: String,
    /* The email address of the user */
    _email: String,
    /* `owner` or `member` */
    _role: String,
    /* The Unix timestamp (in seconds) of when the project was added. */
    _addedAt: Integer
)
object ProjectUser {
    def toStringBody(var_object: Object, var_id: Object, var_name: Object, var_email: Object, var_role: Object, var_addedAt: Object) =
        s"""
        | {
        | "object":$var_object,"id":$var_id,"name":$var_name,"email":$var_email,"role":$var_role,"addedAt":$var_addedAt
        | }
        """.stripMargin
}
