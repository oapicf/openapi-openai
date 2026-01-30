package org.openapitools.server.model


/**
 * The API Key used to perform the audit logged action.
 *
 * @param id The tracking id of the API key. for example: ''null''
 * @param `type` The type of API key. Can be either `user` or `service_account`. for example: ''null''
 * @param user  for example: ''null''
 * @param serviceAccount  for example: ''null''
*/
final case class AuditLogActorApiKey (
  id: Option[String] = None,
  `type`: Option[String] = None,
  user: Option[AuditLogActorUser] = None,
  serviceAccount: Option[AuditLogActorServiceAccount] = None
)

