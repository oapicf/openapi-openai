
package org.openapitools.client.model


case class AuditLogServiceAccountDeleted (
    /* The service account ID. */
    _id: Option[String]
)
object AuditLogServiceAccountDeleted {
    def toStringBody(var_id: Object) =
        s"""
        | {
        | "id":$var_id
        | }
        """.stripMargin
}
