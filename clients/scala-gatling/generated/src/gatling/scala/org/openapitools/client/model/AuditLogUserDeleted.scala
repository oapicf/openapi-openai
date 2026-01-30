
package org.openapitools.client.model


case class AuditLogUserDeleted (
    /* The user ID. */
    _id: Option[String]
)
object AuditLogUserDeleted {
    def toStringBody(var_id: Object) =
        s"""
        | {
        | "id":$var_id
        | }
        """.stripMargin
}
