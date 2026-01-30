package org.openapitools.server.model


/**
 * The details for events with this `type`.
 *
 * @param id The ID of the invite. for example: ''null''
*/
final case class AuditLogInviteAccepted (
  id: Option[String] = None
)

