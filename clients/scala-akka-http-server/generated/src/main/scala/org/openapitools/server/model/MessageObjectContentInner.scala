package org.openapitools.server.model


/**
 * @param `type` Always `image_file`. for example: ''null''
 * @param imageFile  for example: ''null''
 * @param text  for example: ''null''
*/
final case class MessageObjectContentInner (
  `type`: String,
  imageFile: MessageContentImageFileObjectImageFile,
  text: MessageContentTextObjectText
)

