package org.openapitools.server.model


/**
 * For requests that failed with a non-HTTP error, this will contain more information on the cause of the failure.
 *
 * @param code A machine-readable error code. for example: ''null''
 * @param message A human-readable error message. for example: ''null''
*/
final case class BatchRequestOutputError (
  code: Option[String] = None,
  message: Option[String] = None
)

