package org.openapitools.server.model


/**
 * The aggregated audio transcriptions usage details of the specific time bucket.
 *
 * @param `object`  for example: ''null''
 * @param seconds The number of seconds processed. for example: ''null''
 * @param numModelRequests The count of requests made to the model. for example: ''null''
 * @param projectId When `group_by=project_id`, this field provides the project ID of the grouped usage result. for example: ''null''
 * @param userId When `group_by=user_id`, this field provides the user ID of the grouped usage result. for example: ''null''
 * @param apiKeyId When `group_by=api_key_id`, this field provides the API key ID of the grouped usage result. for example: ''null''
 * @param model When `group_by=model`, this field provides the model name of the grouped usage result. for example: ''null''
*/
final case class UsageAudioTranscriptionsResult (
  `object`: String,
  seconds: Int,
  numModelRequests: Int,
  projectId: Option[String] = None,
  userId: Option[String] = None,
  apiKeyId: Option[String] = None,
  model: Option[String] = None
)

