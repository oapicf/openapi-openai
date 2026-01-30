package org.openapitools.server.model


/**
 * The project that the action was scoped to. Absent for actions not scoped to projects.
 *
 * @param id The project ID. for example: ''null''
 * @param name The project title. for example: ''null''
*/
final case class AuditLogProject (
  id: Option[String] = None,
  name: Option[String] = None
)

