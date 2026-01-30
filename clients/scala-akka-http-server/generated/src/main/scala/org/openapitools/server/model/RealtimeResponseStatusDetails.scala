package org.openapitools.server.model


/**
 * Additional details about the status.
 *
 * @param `type` The type of error that caused the response to fail, corresponding  with the `status` field (`completed`, `cancelled`, `incomplete`,  `failed`).  for example: ''null''
 * @param reason The reason the Response did not complete. For a `cancelled` Response,  one of `turn_detected` (the server VAD detected a new start of speech)  or `client_cancelled` (the client sent a cancel event). For an  `incomplete` Response, one of `max_output_tokens` or `content_filter`  (the server-side safety filter activated and cut off the response).  for example: ''null''
 * @param error  for example: ''null''
*/
final case class RealtimeResponseStatusDetails (
  `type`: Option[String] = None,
  reason: Option[String] = None,
  error: Option[RealtimeResponseStatusDetailsError] = None
)

