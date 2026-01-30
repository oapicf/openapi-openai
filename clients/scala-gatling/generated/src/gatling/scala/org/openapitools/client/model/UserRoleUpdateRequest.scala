
package org.openapitools.client.model


case class UserRoleUpdateRequest (
    /* `owner` or `reader` */
    _role: String
)
object UserRoleUpdateRequest {
    def toStringBody(var_role: Object) =
        s"""
        | {
        | "role":$var_role
        | }
        """.stripMargin
}
