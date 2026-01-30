package org.openapitools.server.model


/**
 * An object describing an image to classify.
 *
 * @param `type` Always `image_url`. for example: ''null''
 * @param imageUrl  for example: ''null''
*/
final case class CreateModerationRequestInputOneOfInnerOneOf (
  `type`: String,
  imageUrl: CreateModerationRequestInputOneOfInnerOneOfImageUrl
)

