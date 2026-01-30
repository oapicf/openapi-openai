
package org.openapitools.client.model


case class AuditLogServiceAccountCreated (
    /* The service account ID. */
    _id: Option[String],
    _data: Option[AuditLogServiceAccountCreatedData]
)
object AuditLogServiceAccountCreated {
    def toStringBody(var_id: Object, var_data: Object) =
        s"""
        | {
        | "id":$var_id,"data":$var_data
        | }
        """.stripMargin
}
