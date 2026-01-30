package org.openapitools.server.model


/**
 * The details for events with this `type`.
 *
 * @param id The project ID. for example: ''null''
 * @param data  for example: ''null''
*/
final case class AuditLogProjectCreated (
  id: Option[String] = None,
  data: Option[AuditLogProjectCreatedData] = None
)

