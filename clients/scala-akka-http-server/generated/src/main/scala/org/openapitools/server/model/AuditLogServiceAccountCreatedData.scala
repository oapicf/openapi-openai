package org.openapitools.server.model


/**
 * The payload used to create the service account.
 *
 * @param role The role of the service account. Is either `owner` or `member`. for example: ''null''
*/
final case class AuditLogServiceAccountCreatedData (
  role: Option[String] = None
)

