package org.openapitools.server.model


/**
 * Represents an individual user in a project.
 *
 * @param `object` The object type, which is always `organization.project.user` for example: ''null''
 * @param id The identifier, which can be referenced in API endpoints for example: ''null''
 * @param name The name of the user for example: ''null''
 * @param email The email address of the user for example: ''null''
 * @param role `owner` or `member` for example: ''null''
 * @param addedAt The Unix timestamp (in seconds) of when the project was added. for example: ''null''
*/
final case class ProjectUser (
  `object`: String,
  id: String,
  name: String,
  email: String,
  role: String,
  addedAt: Int
)

