package org.openapitools.server.model


/**
 * @param created  for example: ''null''
 * @param data  for example: ''null''
*/
final case class ImagesResponse (
  created: Int,
  data: Seq[ImagesResponseDataInner]
)

