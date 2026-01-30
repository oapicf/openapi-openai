
package org.openapitools.client.model


case class AuditLogProjectCreatedData (
    /* The project name. */
    _name: Option[String],
    /* The title of the project as seen on the dashboard. */
    _title: Option[String]
)
object AuditLogProjectCreatedData {
    def toStringBody(var_name: Object, var_title: Object) =
        s"""
        | {
        | "name":$var_name,"title":$var_title
        | }
        """.stripMargin
}
