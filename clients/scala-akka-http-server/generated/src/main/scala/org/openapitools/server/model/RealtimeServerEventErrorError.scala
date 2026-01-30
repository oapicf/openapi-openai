package org.openapitools.server.model


/**
 * Details of the error.
 *
 * @param `type` The type of error (e.g., \"invalid_request_error\", \"server_error\").  for example: ''null''
 * @param code Error code, if any. for example: ''null''
 * @param message A human-readable error message. for example: ''null''
 * @param param Parameter related to the error, if any. for example: ''null''
 * @param eventId The event_id of the client event that caused the error, if applicable.  for example: ''null''
*/
final case class RealtimeServerEventErrorError (
  `type`: String,
  code: Option[String] = None,
  message: String,
  param: Option[String] = None,
  eventId: Option[String] = None
)

