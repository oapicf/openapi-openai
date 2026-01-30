package org.openapitools.server.model


/**
 * The aggregated completions usage details of the specific time bucket.
 *
 * @param `object`  for example: ''null''
 * @param inputTokens The aggregated number of text input tokens used, including cached tokens. For customers subscribe to scale tier, this includes scale tier tokens. for example: ''null''
 * @param inputCachedTokens The aggregated number of text input tokens that has been cached from previous requests. For customers subscribe to scale tier, this includes scale tier tokens. for example: ''null''
 * @param outputTokens The aggregated number of text output tokens used. For customers subscribe to scale tier, this includes scale tier tokens. for example: ''null''
 * @param inputAudioTokens The aggregated number of audio input tokens used, including cached tokens. for example: ''null''
 * @param outputAudioTokens The aggregated number of audio output tokens used. for example: ''null''
 * @param numModelRequests The count of requests made to the model. for example: ''null''
 * @param projectId When `group_by=project_id`, this field provides the project ID of the grouped usage result. for example: ''null''
 * @param userId When `group_by=user_id`, this field provides the user ID of the grouped usage result. for example: ''null''
 * @param apiKeyId When `group_by=api_key_id`, this field provides the API key ID of the grouped usage result. for example: ''null''
 * @param model When `group_by=model`, this field provides the model name of the grouped usage result. for example: ''null''
 * @param batch When `group_by=batch`, this field tells whether the grouped usage result is batch or not. for example: ''null''
*/
final case class UsageCompletionsResult (
  `object`: String,
  inputTokens: Int,
  inputCachedTokens: Option[Int] = None,
  outputTokens: Int,
  inputAudioTokens: Option[Int] = None,
  outputAudioTokens: Option[Int] = None,
  numModelRequests: Int,
  projectId: Option[String] = None,
  userId: Option[String] = None,
  apiKeyId: Option[String] = None,
  model: Option[String] = None,
  batch: Option[Boolean] = None
)

