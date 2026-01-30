package org.openapitools.server.model


/**
 * @param `object`  for example: ''null''
 * @param data  for example: ''null''
 * @param firstId  for example: ''null''
 * @param lastId  for example: ''null''
 * @param hasMore  for example: ''null''
*/
final case class ProjectUserListResponse (
  `object`: String,
  data: Seq[ProjectUser],
  firstId: String,
  lastId: String,
  hasMore: Boolean
)

