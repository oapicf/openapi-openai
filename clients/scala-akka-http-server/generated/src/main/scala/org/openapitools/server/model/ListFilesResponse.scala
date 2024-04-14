package org.openapitools.server.model


/**
 * @param data  for example: ''null''
 * @param `object`  for example: ''null''
*/
final case class ListFilesResponse (
  data: Seq[OpenAIFile],
  `object`: String
)

