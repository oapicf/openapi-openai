package org.openapitools.server.model


/**
 * The payload used to update the user.
 *
 * @param role The role of the user. Is either `owner` or `member`. for example: ''null''
*/
final case class AuditLogUserUpdatedChangesRequested (
  role: Option[String] = None
)

