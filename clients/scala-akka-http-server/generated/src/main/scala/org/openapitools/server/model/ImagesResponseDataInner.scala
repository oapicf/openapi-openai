package org.openapitools.server.model


/**
 * @param url  for example: ''null''
 * @param b64Json  for example: ''null''
*/
final case class ImagesResponseDataInner (
  url: Option[String] = None,
  b64Json: Option[String] = None
)

