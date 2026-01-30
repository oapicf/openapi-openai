package org.openapitools.server.model


/**
 * The payload used to add the user to the project.
 *
 * @param role The role of the user. Is either `owner` or `member`. for example: ''null''
*/
final case class AuditLogUserAddedData (
  role: Option[String] = None
)

