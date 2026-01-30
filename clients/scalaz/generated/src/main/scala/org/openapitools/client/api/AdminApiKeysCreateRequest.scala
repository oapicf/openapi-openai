package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AdminApiKeysCreateRequest._

case class AdminApiKeysCreateRequest (
  name: String)

object AdminApiKeysCreateRequest {
  import DateTimeCodecs._

  implicit val AdminApiKeysCreateRequestCodecJson: CodecJson[AdminApiKeysCreateRequest] = CodecJson.derive[AdminApiKeysCreateRequest]
  implicit val AdminApiKeysCreateRequestDecoder: EntityDecoder[AdminApiKeysCreateRequest] = jsonOf[AdminApiKeysCreateRequest]
  implicit val AdminApiKeysCreateRequestEncoder: EntityEncoder[AdminApiKeysCreateRequest] = jsonEncoderOf[AdminApiKeysCreateRequest]
}
