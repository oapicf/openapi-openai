package org.openapitools.server.model


/**
 * The payload used to update the project.
 *
 * @param title The title of the project as seen on the dashboard. for example: ''null''
*/
final case class AuditLogProjectUpdatedChangesRequested (
  title: Option[String] = None
)

