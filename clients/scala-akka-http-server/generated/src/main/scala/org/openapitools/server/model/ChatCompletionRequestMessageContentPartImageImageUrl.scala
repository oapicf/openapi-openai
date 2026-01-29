package org.openapitools.server.model

import java.net.URI

/**
 * @param url Either a URL of the image or the base64 encoded image data. for example: ''null''
 * @param detail Specifies the detail level of the image. Learn more in the [Vision guide](/docs/guides/vision/low-or-high-fidelity-image-understanding). for example: ''null''
*/
final case class ChatCompletionRequestMessageContentPartImageImageUrl (
  url: URI,
  detail: Option[String] = None
)

