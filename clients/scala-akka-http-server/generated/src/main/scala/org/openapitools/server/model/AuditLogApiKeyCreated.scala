package org.openapitools.server.model


/**
 * The details for events with this `type`.
 *
 * @param id The tracking ID of the API key. for example: ''null''
 * @param data  for example: ''null''
*/
final case class AuditLogApiKeyCreated (
  id: Option[String] = None,
  data: Option[AuditLogApiKeyCreatedData] = None
)

