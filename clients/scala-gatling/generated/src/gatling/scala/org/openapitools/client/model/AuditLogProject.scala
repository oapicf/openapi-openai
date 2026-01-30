
package org.openapitools.client.model


case class AuditLogProject (
    /* The project ID. */
    _id: Option[String],
    /* The project title. */
    _name: Option[String]
)
object AuditLogProject {
    def toStringBody(var_id: Object, var_name: Object) =
        s"""
        | {
        | "id":$var_id,"name":$var_name
        | }
        """.stripMargin
}
