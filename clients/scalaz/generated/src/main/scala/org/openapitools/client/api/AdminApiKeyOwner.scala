package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AdminApiKeyOwner._

case class AdminApiKeyOwner (
  `type`: Option[String],
id: Option[String],
name: Option[String],
createdAt: Option[Long],
role: Option[String])

object AdminApiKeyOwner {
  import DateTimeCodecs._

  implicit val AdminApiKeyOwnerCodecJson: CodecJson[AdminApiKeyOwner] = CodecJson.derive[AdminApiKeyOwner]
  implicit val AdminApiKeyOwnerDecoder: EntityDecoder[AdminApiKeyOwner] = jsonOf[AdminApiKeyOwner]
  implicit val AdminApiKeyOwnerEncoder: EntityEncoder[AdminApiKeyOwner] = jsonEncoderOf[AdminApiKeyOwner]
}
