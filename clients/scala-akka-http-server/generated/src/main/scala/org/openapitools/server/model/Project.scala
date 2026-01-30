package org.openapitools.server.model


/**
 * Represents an individual project.
 *
 * @param id The identifier, which can be referenced in API endpoints for example: ''null''
 * @param `object` The object type, which is always `organization.project` for example: ''null''
 * @param name The name of the project. This appears in reporting. for example: ''null''
 * @param createdAt The Unix timestamp (in seconds) of when the project was created. for example: ''null''
 * @param archivedAt The Unix timestamp (in seconds) of when the project was archived or `null`. for example: ''null''
 * @param status `active` or `archived` for example: ''null''
*/
final case class Project (
  id: String,
  `object`: String,
  name: String,
  createdAt: Int,
  archivedAt: Option[Int] = None,
  status: String
)

