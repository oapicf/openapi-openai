
package org.openapitools.client.model


case class InviteRequestProjectsInner (
    /* Project's public ID */
    _id: String,
    /* Project membership role */
    _role: String
)
object InviteRequestProjectsInner {
    def toStringBody(var_id: Object, var_role: Object) =
        s"""
        | {
        | "id":$var_id,"role":$var_role
        | }
        """.stripMargin
}
