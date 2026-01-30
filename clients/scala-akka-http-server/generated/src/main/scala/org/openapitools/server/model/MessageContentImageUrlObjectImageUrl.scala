package org.openapitools.server.model

import java.net.URI

/**
 * @param url The external URL of the image, must be a supported image types: jpeg, jpg, png, gif, webp. for example: ''null''
 * @param detail Specifies the detail level of the image. `low` uses fewer tokens, you can opt in to high resolution using `high`. Default value is `auto` for example: ''null''
*/
final case class MessageContentImageUrlObjectImageUrl (
  url: URI,
  detail: Option[String] = None
)

