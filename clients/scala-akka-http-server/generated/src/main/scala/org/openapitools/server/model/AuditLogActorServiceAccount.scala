package org.openapitools.server.model


/**
 * The service account that performed the audit logged action.
 *
 * @param id The service account id. for example: ''null''
*/
final case class AuditLogActorServiceAccount (
  id: Option[String] = None
)

