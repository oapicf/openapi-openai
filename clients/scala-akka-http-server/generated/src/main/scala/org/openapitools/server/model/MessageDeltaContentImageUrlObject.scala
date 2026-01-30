package org.openapitools.server.model


/**
 * = Image URL =
 *
 * References an image URL in the content of a message.
 *
 * @param index The index of the content part in the message. for example: ''null''
 * @param `type` Always `image_url`. for example: ''null''
 * @param imageUrl  for example: ''null''
*/
final case class MessageDeltaContentImageUrlObject (
  index: Int,
  `type`: String,
  imageUrl: Option[MessageDeltaContentImageUrlObjectImageUrl] = None
)

