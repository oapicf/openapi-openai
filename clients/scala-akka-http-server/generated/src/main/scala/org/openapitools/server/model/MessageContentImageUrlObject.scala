package org.openapitools.server.model


/**
 * = Image URL =
 *
 * References an image URL in the content of a message.
 *
 * @param `type` The type of the content part. for example: ''null''
 * @param imageUrl  for example: ''null''
*/
final case class MessageContentImageUrlObject (
  `type`: String,
  imageUrl: MessageContentImageUrlObjectImageUrl
)

