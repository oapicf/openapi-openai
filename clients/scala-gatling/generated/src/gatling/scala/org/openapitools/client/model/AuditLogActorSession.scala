
package org.openapitools.client.model


case class AuditLogActorSession (
    _user: Option[AuditLogActorUser],
    /* The IP address from which the action was performed. */
    _ipAddress: Option[String]
)
object AuditLogActorSession {
    def toStringBody(var_user: Object, var_ipAddress: Object) =
        s"""
        | {
        | "user":$var_user,"ipAddress":$var_ipAddress
        | }
        """.stripMargin
}
