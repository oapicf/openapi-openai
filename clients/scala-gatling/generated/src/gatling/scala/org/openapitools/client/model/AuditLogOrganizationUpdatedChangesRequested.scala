
package org.openapitools.client.model


case class AuditLogOrganizationUpdatedChangesRequested (
    /* The organization title. */
    _title: Option[String],
    /* The organization description. */
    _description: Option[String],
    /* The organization name. */
    _name: Option[String],
    _settings: Option[AuditLogOrganizationUpdatedChangesRequestedSettings]
)
object AuditLogOrganizationUpdatedChangesRequested {
    def toStringBody(var_title: Object, var_description: Object, var_name: Object, var_settings: Object) =
        s"""
        | {
        | "title":$var_title,"description":$var_description,"name":$var_name,"settings":$var_settings
        | }
        """.stripMargin
}
