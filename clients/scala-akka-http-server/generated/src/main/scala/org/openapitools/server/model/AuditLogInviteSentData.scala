package org.openapitools.server.model


/**
 * The payload used to create the invite.
 *
 * @param email The email invited to the organization. for example: ''null''
 * @param role The role the email was invited to be. Is either `owner` or `member`. for example: ''null''
*/
final case class AuditLogInviteSentData (
  email: Option[String] = None,
  role: Option[String] = None
)

