package org.openapitools.server.model


/**
 * @param `type`  for example: ''null''
 * @param message  for example: ''null''
 * @param param  for example: ''null''
 * @param code  for example: ''null''
*/
final case class Error (
  `type`: String,
  message: String,
  param: String,
  code: String
)

