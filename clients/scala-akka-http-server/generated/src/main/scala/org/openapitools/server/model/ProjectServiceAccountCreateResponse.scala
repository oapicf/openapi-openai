package org.openapitools.server.model


/**
 * @param `object`  for example: ''null''
 * @param id  for example: ''null''
 * @param name  for example: ''null''
 * @param role Service accounts can only have one role of type `member` for example: ''null''
 * @param createdAt  for example: ''null''
 * @param apiKey  for example: ''null''
*/
final case class ProjectServiceAccountCreateResponse (
  `object`: String,
  id: String,
  name: String,
  role: String,
  createdAt: Int,
  apiKey: ProjectServiceAccountApiKey
)

