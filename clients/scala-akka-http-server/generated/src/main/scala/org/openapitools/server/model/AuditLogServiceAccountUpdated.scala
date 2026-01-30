package org.openapitools.server.model


/**
 * The details for events with this `type`.
 *
 * @param id The service account ID. for example: ''null''
 * @param changesRequested  for example: ''null''
*/
final case class AuditLogServiceAccountUpdated (
  id: Option[String] = None,
  changesRequested: Option[AuditLogServiceAccountUpdatedChangesRequested] = None
)

