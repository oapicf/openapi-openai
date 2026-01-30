package org.openapitools.server.model


/**
 * @param `type` Always `image_file`. for example: ''null''
 * @param imageFile  for example: ''null''
 * @param imageUrl  for example: ''null''
 * @param text Text content to be sent to the model for example: ''null''
*/
final case class ArrayOfContentPartsInner (
  `type`: String,
  imageFile: MessageContentImageFileObjectImageFile,
  imageUrl: MessageContentImageUrlObjectImageUrl,
  text: String
)

