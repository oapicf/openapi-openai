package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AdminApiKey._

case class AdminApiKey (
  `object`: Option[String],
id: Option[String],
name: Option[String],
redactedValue: Option[String],
value: Option[String],
createdAt: Option[Long],
owner: Option[AdminApiKeyOwner])

object AdminApiKey {
  import DateTimeCodecs._

  implicit val AdminApiKeyCodecJson: CodecJson[AdminApiKey] = CodecJson.derive[AdminApiKey]
  implicit val AdminApiKeyDecoder: EntityDecoder[AdminApiKey] = jsonOf[AdminApiKey]
  implicit val AdminApiKeyEncoder: EntityEncoder[AdminApiKey] = jsonEncoderOf[AdminApiKey]
}
