package org.openapitools.server.model


/**
 * = Image file =
 *
 * References an image [File](/docs/api-reference/files) in the content of a message.
 *
 * @param `type` Always `image_file`. for example: ''null''
 * @param imageFile  for example: ''null''
*/
final case class MessageContentImageFileObject (
  `type`: String,
  imageFile: MessageContentImageFileObjectImageFile
)

