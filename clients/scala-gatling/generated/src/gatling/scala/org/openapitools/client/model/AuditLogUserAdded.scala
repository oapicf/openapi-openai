
package org.openapitools.client.model


case class AuditLogUserAdded (
    /* The user ID. */
    _id: Option[String],
    _data: Option[AuditLogUserAddedData]
)
object AuditLogUserAdded {
    def toStringBody(var_id: Object, var_data: Object) =
        s"""
        | {
        | "id":$var_id,"data":$var_data
        | }
        """.stripMargin
}
