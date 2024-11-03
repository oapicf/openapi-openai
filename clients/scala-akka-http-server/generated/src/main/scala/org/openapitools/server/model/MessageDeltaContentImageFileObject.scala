package org.openapitools.server.model


/**
 * = Image file =
 *
 * References an image [File](/docs/api-reference/files) in the content of a message.
 *
 * @param index The index of the content part in the message. for example: ''null''
 * @param `type` Always `image_file`. for example: ''null''
 * @param imageFile  for example: ''null''
*/
final case class MessageDeltaContentImageFileObject (
  index: Int,
  `type`: String,
  imageFile: Option[MessageDeltaContentImageFileObjectImageFile] = None
)

