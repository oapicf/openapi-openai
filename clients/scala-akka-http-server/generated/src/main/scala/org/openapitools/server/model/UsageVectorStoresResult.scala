package org.openapitools.server.model


/**
 * The aggregated vector stores usage details of the specific time bucket.
 *
 * @param `object`  for example: ''null''
 * @param usageBytes The vector stores usage in bytes. for example: ''null''
 * @param projectId When `group_by=project_id`, this field provides the project ID of the grouped usage result. for example: ''null''
*/
final case class UsageVectorStoresResult (
  `object`: String,
  usageBytes: Int,
  projectId: Option[String] = None
)

