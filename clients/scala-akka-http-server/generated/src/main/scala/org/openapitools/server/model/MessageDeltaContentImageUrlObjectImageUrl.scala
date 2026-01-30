package org.openapitools.server.model


/**
 * @param url The URL of the image, must be a supported image types: jpeg, jpg, png, gif, webp. for example: ''null''
 * @param detail Specifies the detail level of the image. `low` uses fewer tokens, you can opt in to high resolution using `high`. for example: ''null''
*/
final case class MessageDeltaContentImageUrlObjectImageUrl (
  url: Option[String] = None,
  detail: Option[String] = None
)

