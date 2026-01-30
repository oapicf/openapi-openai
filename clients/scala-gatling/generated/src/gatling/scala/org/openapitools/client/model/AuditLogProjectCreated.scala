
package org.openapitools.client.model


case class AuditLogProjectCreated (
    /* The project ID. */
    _id: Option[String],
    _data: Option[AuditLogProjectCreatedData]
)
object AuditLogProjectCreated {
    def toStringBody(var_id: Object, var_data: Object) =
        s"""
        | {
        | "id":$var_id,"data":$var_data
        | }
        """.stripMargin
}
