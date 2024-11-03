package org.openapitools.server.model


/**
 * @param `type` The type of the content part. for example: ''null''
 * @param text The text content. for example: ''null''
 * @param imageUrl  for example: ''null''
*/
final case class ChatCompletionRequestMessageContentPart (
  `type`: String,
  text: String,
  imageUrl: ChatCompletionRequestMessageContentPartImageImageUrl
)

