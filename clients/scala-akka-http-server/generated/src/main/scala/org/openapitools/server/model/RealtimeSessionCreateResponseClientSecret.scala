package org.openapitools.server.model


/**
 * Ephemeral key returned by the API.
 *
 * @param value Ephemeral key usable in client environments to authenticate connections to the Realtime API. Use this in client-side environments rather than a standard API token, which should only be used server-side.  for example: ''null''
 * @param expiresAt Timestamp for when the token expires. Currently, all tokens expire after one minute.  for example: ''null''
*/
final case class RealtimeSessionCreateResponseClientSecret (
  value: Option[String] = None,
  expiresAt: Option[Int] = None
)

