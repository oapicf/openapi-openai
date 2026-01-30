package org.openapitools.server.model


/**
 * @param userId The ID of the user. for example: ''null''
 * @param role `owner` or `member` for example: ''null''
*/
final case class ProjectUserCreateRequest (
  userId: String,
  role: String
)

