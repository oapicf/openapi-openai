package org.openapitools.server.model


/**
 * The session in which the audit logged action was performed.
 *
 * @param user  for example: ''null''
 * @param ipAddress The IP address from which the action was performed. for example: ''null''
*/
final case class AuditLogActorSession (
  user: Option[AuditLogActorUser] = None,
  ipAddress: Option[String] = None
)

