package org.openapitools.server.model


/**
 * @param `type` Always `image_url`. for example: ''null''
 * @param imageUrl  for example: ''null''
 * @param text A string of text to classify. for example: ''I want to kill them''
*/
final case class CreateModerationRequestInputOneOfInner (
  `type`: String,
  imageUrl: CreateModerationRequestInputOneOfInnerOneOfImageUrl,
  text: String
)

