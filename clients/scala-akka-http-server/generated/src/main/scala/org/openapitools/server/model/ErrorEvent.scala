package org.openapitools.server.model


/**
 * Occurs when an [error](/docs/guides/error-codes/api-errors) occurs. This can happen due to an internal server error or a timeout.
 *
 * @param event  for example: ''null''
 * @param data  for example: ''null''
*/
final case class ErrorEvent (
  event: String,
  data: Error
)

