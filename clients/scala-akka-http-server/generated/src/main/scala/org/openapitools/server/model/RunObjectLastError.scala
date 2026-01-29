package org.openapitools.server.model


/**
 * The last error associated with this run. Will be `null` if there are no errors.
 *
 * @param code One of `server_error`, `rate_limit_exceeded`, or `invalid_prompt`. for example: ''null''
 * @param message A human-readable description of the error. for example: ''null''
*/
final case class RunObjectLastError (
  code: String,
  message: String
)

