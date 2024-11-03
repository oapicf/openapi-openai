package org.openapitools.server.model


/**
 * = Image content part =
 *
 * @param `type` The type of the content part. for example: ''null''
 * @param imageUrl  for example: ''null''
*/
final case class ChatCompletionRequestMessageContentPartImage (
  `type`: String,
  imageUrl: ChatCompletionRequestMessageContentPartImageImageUrl
)

