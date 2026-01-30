package org.openapitools.server.model


/**
 * The user who performed the audit logged action.
 *
 * @param id The user id. for example: ''null''
 * @param email The user email. for example: ''null''
*/
final case class AuditLogActorUser (
  id: Option[String] = None,
  email: Option[String] = None
)

