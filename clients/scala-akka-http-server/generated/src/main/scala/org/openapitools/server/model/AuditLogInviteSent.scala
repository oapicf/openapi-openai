package org.openapitools.server.model


/**
 * The details for events with this `type`.
 *
 * @param id The ID of the invite. for example: ''null''
 * @param data  for example: ''null''
*/
final case class AuditLogInviteSent (
  id: Option[String] = None,
  data: Option[AuditLogInviteSentData] = None
)

