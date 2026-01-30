package org.openapitools.server.model


/**
 * The details for events with this `type`.
 *
 * @param id The tracking ID of the API key. for example: ''null''
 * @param changesRequested  for example: ''null''
*/
final case class AuditLogApiKeyUpdated (
  id: Option[String] = None,
  changesRequested: Option[AuditLogApiKeyUpdatedChangesRequested] = None
)

