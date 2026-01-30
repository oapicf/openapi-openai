package org.openapitools.server.model


/**
 * The details for events with this `type`.
 *
 * @param id The user ID. for example: ''null''
 * @param data  for example: ''null''
*/
final case class AuditLogUserAdded (
  id: Option[String] = None,
  data: Option[AuditLogUserAddedData] = None
)

