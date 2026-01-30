
package org.openapitools.client.model


case class InviteProjectsInner (
    /* Project's public ID */
    _id: Option[String],
    /* Project membership role */
    _role: Option[String]
)
object InviteProjectsInner {
    def toStringBody(var_id: Object, var_role: Object) =
        s"""
        | {
        | "id":$var_id,"role":$var_role
        | }
        """.stripMargin
}
