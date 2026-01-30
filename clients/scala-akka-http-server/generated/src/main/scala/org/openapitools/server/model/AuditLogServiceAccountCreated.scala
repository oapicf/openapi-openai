package org.openapitools.server.model


/**
 * The details for events with this `type`.
 *
 * @param id The service account ID. for example: ''null''
 * @param data  for example: ''null''
*/
final case class AuditLogServiceAccountCreated (
  id: Option[String] = None,
  data: Option[AuditLogServiceAccountCreatedData] = None
)

