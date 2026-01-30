
package org.openapitools.client.model


case class AuditLogProjectUpdatedChangesRequested (
    /* The title of the project as seen on the dashboard. */
    _title: Option[String]
)
object AuditLogProjectUpdatedChangesRequested {
    def toStringBody(var_title: Object) =
        s"""
        | {
        | "title":$var_title
        | }
        """.stripMargin
}
