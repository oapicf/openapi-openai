package org.openapitools.server.model

import java.net.URI

/**
 * Contains either an image URL or a data URL for a base64 encoded image.
 *
 * @param url Either a URL of the image or the base64 encoded image data. for example: ''https://example.com/image.jpg''
*/
final case class CreateModerationRequestInputOneOfInnerOneOfImageUrl (
  url: URI
)

