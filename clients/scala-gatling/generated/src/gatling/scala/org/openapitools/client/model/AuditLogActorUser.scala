
package org.openapitools.client.model


case class AuditLogActorUser (
    /* The user id. */
    _id: Option[String],
    /* The user email. */
    _email: Option[String]
)
object AuditLogActorUser {
    def toStringBody(var_id: Object, var_email: Object) =
        s"""
        | {
        | "id":$var_id,"email":$var_email
        | }
        """.stripMargin
}
