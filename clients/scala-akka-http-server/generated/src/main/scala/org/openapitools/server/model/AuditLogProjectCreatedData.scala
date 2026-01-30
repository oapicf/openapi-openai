package org.openapitools.server.model


/**
 * The payload used to create the project.
 *
 * @param name The project name. for example: ''null''
 * @param title The title of the project as seen on the dashboard. for example: ''null''
*/
final case class AuditLogProjectCreatedData (
  name: Option[String] = None,
  title: Option[String] = None
)

