package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RealtimeSessionCreateResponseClientSecret._

case class RealtimeSessionCreateResponseClientSecret (
  /* Ephemeral key usable in client environments to authenticate connections to the Realtime API. Use this in client-side environments rather than a standard API token, which should only be used server-side.  */
  value: Option[String],
/* Timestamp for when the token expires. Currently, all tokens expire after one minute.  */
  expiresAt: Option[Integer])

object RealtimeSessionCreateResponseClientSecret {
  import DateTimeCodecs._

  implicit val RealtimeSessionCreateResponseClientSecretCodecJson: CodecJson[RealtimeSessionCreateResponseClientSecret] = CodecJson.derive[RealtimeSessionCreateResponseClientSecret]
  implicit val RealtimeSessionCreateResponseClientSecretDecoder: EntityDecoder[RealtimeSessionCreateResponseClientSecret] = jsonOf[RealtimeSessionCreateResponseClientSecret]
  implicit val RealtimeSessionCreateResponseClientSecretEncoder: EntityEncoder[RealtimeSessionCreateResponseClientSecret] = jsonEncoderOf[RealtimeSessionCreateResponseClientSecret]
}
