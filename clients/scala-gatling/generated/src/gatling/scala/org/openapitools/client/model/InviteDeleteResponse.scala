
package org.openapitools.client.model


case class InviteDeleteResponse (
    /* The object type, which is always `organization.invite.deleted` */
    _object: String,
    _id: String,
    _deleted: Boolean
)
object InviteDeleteResponse {
    def toStringBody(var_object: Object, var_id: Object, var_deleted: Object) =
        s"""
        | {
        | "object":$var_object,"id":$var_id,"deleted":$var_deleted
        | }
        """.stripMargin
}
