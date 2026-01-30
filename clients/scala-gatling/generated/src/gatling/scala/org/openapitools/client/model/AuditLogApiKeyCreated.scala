
package org.openapitools.client.model


case class AuditLogApiKeyCreated (
    /* The tracking ID of the API key. */
    _id: Option[String],
    _data: Option[AuditLogApiKeyCreatedData]
)
object AuditLogApiKeyCreated {
    def toStringBody(var_id: Object, var_data: Object) =
        s"""
        | {
        | "id":$var_id,"data":$var_data
        | }
        """.stripMargin
}
