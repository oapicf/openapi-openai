package org.openapitools.server.model


/**
 * The payload used to update the organization settings.
 *
 * @param title The organization title. for example: ''null''
 * @param description The organization description. for example: ''null''
 * @param name The organization name. for example: ''null''
 * @param settings  for example: ''null''
*/
final case class AuditLogOrganizationUpdatedChangesRequested (
  title: Option[String] = None,
  description: Option[String] = None,
  name: Option[String] = None,
  settings: Option[AuditLogOrganizationUpdatedChangesRequestedSettings] = None
)

