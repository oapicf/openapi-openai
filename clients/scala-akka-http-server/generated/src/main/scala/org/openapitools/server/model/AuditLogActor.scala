package org.openapitools.server.model


/**
 * The actor who performed the audit logged action.
 *
 * @param `type` The type of actor. Is either `session` or `api_key`. for example: ''null''
 * @param session  for example: ''null''
 * @param apiKey  for example: ''null''
*/
final case class AuditLogActor (
  `type`: Option[String] = None,
  session: Option[AuditLogActorSession] = None,
  apiKey: Option[AuditLogActorApiKey] = None
)

