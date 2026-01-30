package org.openapitools.server.model


/**
 * The details for events with this `type`.
 *
 * @param id The rate limit ID for example: ''null''
*/
final case class AuditLogRateLimitDeleted (
  id: Option[String] = None
)

