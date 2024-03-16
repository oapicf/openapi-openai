package org.openapitools.server.model


/**
 * = OpenAIFile =
 *
 * @param id  for example: ''null''
 * @param `object`  for example: ''null''
 * @param bytes  for example: ''null''
 * @param createdAt  for example: ''null''
 * @param filename  for example: ''null''
 * @param purpose  for example: ''null''
 * @param status  for example: ''null''
 * @param statusDetails  for example: ''null''
*/
final case class OpenAIFile (
  id: String,
  `object`: String,
  bytes: Int,
  createdAt: Int,
  filename: String,
  purpose: String,
  status: Option[String] = None,
  statusDetails: Option[Any] = None
)

