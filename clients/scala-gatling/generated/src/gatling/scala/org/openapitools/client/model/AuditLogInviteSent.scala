
package org.openapitools.client.model


case class AuditLogInviteSent (
    /* The ID of the invite. */
    _id: Option[String],
    _data: Option[AuditLogInviteSentData]
)
object AuditLogInviteSent {
    def toStringBody(var_id: Object, var_data: Object) =
        s"""
        | {
        | "id":$var_id,"data":$var_data
        | }
        """.stripMargin
}
