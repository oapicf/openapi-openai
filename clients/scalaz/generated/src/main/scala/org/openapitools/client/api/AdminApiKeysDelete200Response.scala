package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AdminApiKeysDelete200Response._

case class AdminApiKeysDelete200Response (
  id: Option[String],
`object`: Option[String],
deleted: Option[Boolean])

object AdminApiKeysDelete200Response {
  import DateTimeCodecs._

  implicit val AdminApiKeysDelete200ResponseCodecJson: CodecJson[AdminApiKeysDelete200Response] = CodecJson.derive[AdminApiKeysDelete200Response]
  implicit val AdminApiKeysDelete200ResponseDecoder: EntityDecoder[AdminApiKeysDelete200Response] = jsonOf[AdminApiKeysDelete200Response]
  implicit val AdminApiKeysDelete200ResponseEncoder: EntityEncoder[AdminApiKeysDelete200Response] = jsonEncoderOf[AdminApiKeysDelete200Response]
}
