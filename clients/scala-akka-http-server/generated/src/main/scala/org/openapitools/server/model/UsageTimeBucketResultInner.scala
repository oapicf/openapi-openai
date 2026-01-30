package org.openapitools.server.model


/**
 * @param `object`  for example: ''null''
 * @param inputTokens The aggregated number of input tokens used. for example: ''null''
 * @param inputCachedTokens The aggregated number of text input tokens that has been cached from previous requests. For customers subscribe to scale tier, this includes scale tier tokens. for example: ''null''
 * @param outputTokens The aggregated number of text output tokens used. For customers subscribe to scale tier, this includes scale tier tokens. for example: ''null''
 * @param inputAudioTokens The aggregated number of audio input tokens used, including cached tokens. for example: ''null''
 * @param outputAudioTokens The aggregated number of audio output tokens used. for example: ''null''
 * @param numModelRequests The count of requests made to the model. for example: ''null''
 * @param projectId When `group_by=project_id`, this field provides the project ID of the grouped costs result. for example: ''null''
 * @param userId When `group_by=user_id`, this field provides the user ID of the grouped usage result. for example: ''null''
 * @param apiKeyId When `group_by=api_key_id`, this field provides the API key ID of the grouped usage result. for example: ''null''
 * @param model When `group_by=model`, this field provides the model name of the grouped usage result. for example: ''null''
 * @param batch When `group_by=batch`, this field tells whether the grouped usage result is batch or not. for example: ''null''
 * @param images The number of images processed. for example: ''null''
 * @param source When `group_by=source`, this field provides the source of the grouped usage result, possible values are `image.generation`, `image.edit`, `image.variation`. for example: ''null''
 * @param size When `group_by=size`, this field provides the image size of the grouped usage result. for example: ''null''
 * @param characters The number of characters processed. for example: ''null''
 * @param seconds The number of seconds processed. for example: ''null''
 * @param usageBytes The vector stores usage in bytes. for example: ''null''
 * @param sessions The number of code interpreter sessions. for example: ''null''
 * @param amount  for example: ''null''
 * @param lineItem When `group_by=line_item`, this field provides the line item of the grouped costs result. for example: ''null''
*/
final case class UsageTimeBucketResultInner (
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
  batch: Option[Boolean] = None,
  images: Int,
  source: Option[String] = None,
  size: Option[String] = None,
  characters: Int,
  seconds: Int,
  usageBytes: Int,
  sessions: Int,
  amount: Option[CostsResultAmount] = None,
  lineItem: Option[String] = None
)

