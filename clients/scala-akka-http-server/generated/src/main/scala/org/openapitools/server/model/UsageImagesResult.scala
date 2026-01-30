package org.openapitools.server.model


/**
 * The aggregated images usage details of the specific time bucket.
 *
 * @param `object`  for example: ''null''
 * @param images The number of images processed. for example: ''null''
 * @param numModelRequests The count of requests made to the model. for example: ''null''
 * @param source When `group_by=source`, this field provides the source of the grouped usage result, possible values are `image.generation`, `image.edit`, `image.variation`. for example: ''null''
 * @param size When `group_by=size`, this field provides the image size of the grouped usage result. for example: ''null''
 * @param projectId When `group_by=project_id`, this field provides the project ID of the grouped usage result. for example: ''null''
 * @param userId When `group_by=user_id`, this field provides the user ID of the grouped usage result. for example: ''null''
 * @param apiKeyId When `group_by=api_key_id`, this field provides the API key ID of the grouped usage result. for example: ''null''
 * @param model When `group_by=model`, this field provides the model name of the grouped usage result. for example: ''null''
*/
final case class UsageImagesResult (
  `object`: String,
  images: Int,
  numModelRequests: Int,
  source: Option[String] = None,
  size: Option[String] = None,
  projectId: Option[String] = None,
  userId: Option[String] = None,
  apiKeyId: Option[String] = None,
  model: Option[String] = None
)

