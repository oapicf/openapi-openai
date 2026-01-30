
package org.openapitools.client.model


case class AuditLogApiKeyDeleted (
    /* The tracking ID of the API key. */
    _id: Option[String]
)
object AuditLogApiKeyDeleted {
    def toStringBody(var_id: Object) =
        s"""
        | {
        | "id":$var_id
        | }
        """.stripMargin
}
