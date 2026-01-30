
package org.openapitools.client.model


case class ProjectUserCreateRequest (
    /* The ID of the user. */
    _userId: String,
    /* `owner` or `member` */
    _role: String
)
object ProjectUserCreateRequest {
    def toStringBody(var_userId: Object, var_role: Object) =
        s"""
        | {
        | "userId":$var_userId,"role":$var_role
        | }
        """.stripMargin
}
