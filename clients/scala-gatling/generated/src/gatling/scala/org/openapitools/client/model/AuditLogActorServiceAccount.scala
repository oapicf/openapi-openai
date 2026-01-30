
package org.openapitools.client.model


case class AuditLogActorServiceAccount (
    /* The service account id. */
    _id: Option[String]
)
object AuditLogActorServiceAccount {
    def toStringBody(var_id: Object) =
        s"""
        | {
        | "id":$var_id
        | }
        """.stripMargin
}
