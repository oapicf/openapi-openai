
package org.openapitools.client.model


case class AuditLogInviteAccepted (
    /* The ID of the invite. */
    _id: Option[String]
)
object AuditLogInviteAccepted {
    def toStringBody(var_id: Object) =
        s"""
        | {
        | "id":$var_id
        | }
        """.stripMargin
}
