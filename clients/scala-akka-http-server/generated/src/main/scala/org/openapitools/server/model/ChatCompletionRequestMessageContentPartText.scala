package org.openapitools.server.model


/**
 * = Text content part =
 *
 * Learn about [text inputs](/docs/guides/text-generation). 
 *
 * @param `type` The type of the content part. for example: ''null''
 * @param text The text content. for example: ''null''
*/
final case class ChatCompletionRequestMessageContentPartText (
  `type`: String,
  text: String
)

