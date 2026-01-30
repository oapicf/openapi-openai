
package org.openapitools.client.model


case class AuditLogProjectArchived (
    /* The project ID. */
    _id: Option[String]
)
object AuditLogProjectArchived {
    def toStringBody(var_id: Object) =
        s"""
        | {
        | "id":$var_id
        | }
        """.stripMargin
}
