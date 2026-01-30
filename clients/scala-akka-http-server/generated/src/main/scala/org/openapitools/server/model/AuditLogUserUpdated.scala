package org.openapitools.server.model


/**
 * The details for events with this `type`.
 *
 * @param id The project ID. for example: ''null''
 * @param changesRequested  for example: ''null''
*/
final case class AuditLogUserUpdated (
  id: Option[String] = None,
  changesRequested: Option[AuditLogUserUpdatedChangesRequested] = None
)

