package org.openapitools.server.model


/**
 * The aggregated code interpreter sessions usage details of the specific time bucket.
 *
 * @param `object`  for example: ''null''
 * @param sessions The number of code interpreter sessions. for example: ''null''
 * @param projectId When `group_by=project_id`, this field provides the project ID of the grouped usage result. for example: ''null''
*/
final case class UsageCodeInterpreterSessionsResult (
  `object`: String,
  sessions: Int,
  projectId: Option[String] = None
)

