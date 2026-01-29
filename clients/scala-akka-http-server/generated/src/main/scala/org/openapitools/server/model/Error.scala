package org.openapitools.server.model


/**
 * @param code  for example: ''null''
 * @param message  for example: ''null''
 * @param param  for example: ''null''
 * @param `type`  for example: ''null''
*/
final case class Error (
  code: String,
  message: String,
  param: String,
  `type`: String
)

