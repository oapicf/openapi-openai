
package org.openapitools.client.model


case class ProjectServiceAccount (
    /* The object type, which is always `organization.project.service_account` */
    _object: String,
    /* The identifier, which can be referenced in API endpoints */
    _id: String,
    /* The name of the service account */
    _name: String,
    /* `owner` or `member` */
    _role: String,
    /* The Unix timestamp (in seconds) of when the service account was created */
    _createdAt: Integer
)
object ProjectServiceAccount {
    def toStringBody(var_object: Object, var_id: Object, var_name: Object, var_role: Object, var_createdAt: Object) =
        s"""
        | {
        | "object":$var_object,"id":$var_id,"name":$var_name,"role":$var_role,"createdAt":$var_createdAt
        | }
        """.stripMargin
}
