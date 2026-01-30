
package org.openapitools.client.model


case class ProjectUserUpdateRequest (
    /* `owner` or `member` */
    _role: String
)
object ProjectUserUpdateRequest {
    def toStringBody(var_role: Object) =
        s"""
        | {
        | "role":$var_role
        | }
        """.stripMargin
}
