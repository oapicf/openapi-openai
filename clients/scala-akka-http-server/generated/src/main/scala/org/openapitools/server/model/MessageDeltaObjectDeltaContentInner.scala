package org.openapitools.server.model


/**
 * @param index The index of the content part in the message. for example: ''null''
 * @param `type` Always `image_file`. for example: ''null''
 * @param imageFile  for example: ''null''
 * @param text  for example: ''null''
 * @param refusal  for example: ''null''
 * @param imageUrl  for example: ''null''
*/
final case class MessageDeltaObjectDeltaContentInner (
  index: Int,
  `type`: String,
  imageFile: Option[MessageDeltaContentImageFileObjectImageFile] = None,
  text: Option[MessageDeltaContentTextObjectText] = None,
  refusal: Option[String] = None,
  imageUrl: Option[MessageDeltaContentImageUrlObjectImageUrl] = None
)

