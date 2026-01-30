package org.openapitools.server.model


/**
 * The payload used to updated the service account.
 *
 * @param role The role of the service account. Is either `owner` or `member`. for example: ''null''
*/
final case class AuditLogServiceAccountUpdatedChangesRequested (
  role: Option[String] = None
)

