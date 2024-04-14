package org.openapitools.server.model


/**
 * The last error associated with this run step. Will be `null` if there are no errors.
 *
 * @param code One of `server_error` or `rate_limit_exceeded`. for example: ''null''
 * @param message A human-readable description of the error. for example: ''null''
*/
final case class RunStepObjectLastError (
  code: String,
  message: String
)

