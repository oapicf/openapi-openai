package org.openapitools.server.model


/**
 * Represents an individual API key in a project.
 *
 * @param `object` The object type, which is always `organization.project.api_key` for example: ''null''
 * @param redactedValue The redacted value of the API key for example: ''null''
 * @param name The name of the API key for example: ''null''
 * @param createdAt The Unix timestamp (in seconds) of when the API key was created for example: ''null''
 * @param id The identifier, which can be referenced in API endpoints for example: ''null''
 * @param owner  for example: ''null''
*/
final case class ProjectApiKey (
  `object`: String,
  redactedValue: String,
  name: String,
  createdAt: Int,
  id: String,
  owner: ProjectApiKeyOwner
)

