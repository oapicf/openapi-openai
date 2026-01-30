package org.openapitools.server.model


/**
 * The details for events with this `type`.
 *
 * @param id The organization ID. for example: ''null''
 * @param changesRequested  for example: ''null''
*/
final case class AuditLogOrganizationUpdated (
  id: Option[String] = None,
  changesRequested: Option[AuditLogOrganizationUpdatedChangesRequested] = None
)

