package org.openapitools.server.model


/**
 * The details for events with this `type`.
 *
 * @param id The rate limit ID for example: ''null''
 * @param changesRequested  for example: ''null''
*/
final case class AuditLogRateLimitUpdated (
  id: Option[String] = None,
  changesRequested: Option[AuditLogRateLimitUpdatedChangesRequested] = None
)

