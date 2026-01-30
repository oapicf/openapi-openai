
package org.openapitools.client.model


case class AuditLogRateLimitDeleted (
    /* The rate limit ID */
    _id: Option[String]
)
object AuditLogRateLimitDeleted {
    def toStringBody(var_id: Object) =
        s"""
        | {
        | "id":$var_id
        | }
        """.stripMargin
}
