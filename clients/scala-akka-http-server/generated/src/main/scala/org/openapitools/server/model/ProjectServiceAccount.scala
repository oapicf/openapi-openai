package org.openapitools.server.model


/**
 * Represents an individual service account in a project.
 *
 * @param `object` The object type, which is always `organization.project.service_account` for example: ''null''
 * @param id The identifier, which can be referenced in API endpoints for example: ''null''
 * @param name The name of the service account for example: ''null''
 * @param role `owner` or `member` for example: ''null''
 * @param createdAt The Unix timestamp (in seconds) of when the service account was created for example: ''null''
*/
final case class ProjectServiceAccount (
  `object`: String,
  id: String,
  name: String,
  role: String,
  createdAt: Int
)

