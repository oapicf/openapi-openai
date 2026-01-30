
package org.openapitools.client.model


case class AuditLogOrganizationUpdatedChangesRequestedSettings (
    /* Visibility of the threads page which shows messages created with the Assistants API and Playground. One of `ANY_ROLE`, `OWNERS`, or `NONE`. */
    _threadsUiVisibility: Option[String],
    /* Visibility of the usage dashboard which shows activity and costs for your organization. One of `ANY_ROLE` or `OWNERS`. */
    _usageDashboardVisibility: Option[String]
)
object AuditLogOrganizationUpdatedChangesRequestedSettings {
    def toStringBody(var_threadsUiVisibility: Object, var_usageDashboardVisibility: Object) =
        s"""
        | {
        | "threadsUiVisibility":$var_threadsUiVisibility,"usageDashboardVisibility":$var_usageDashboardVisibility
        | }
        """.stripMargin
}
