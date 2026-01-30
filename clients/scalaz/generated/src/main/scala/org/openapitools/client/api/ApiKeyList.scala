package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ApiKeyList._

case class ApiKeyList (
  `object`: Option[String],
data: Option[List[AdminApiKey]],
hasMore: Option[Boolean],
firstId: Option[String],
lastId: Option[String])

object ApiKeyList {
  import DateTimeCodecs._

  implicit val ApiKeyListCodecJson: CodecJson[ApiKeyList] = CodecJson.derive[ApiKeyList]
  implicit val ApiKeyListDecoder: EntityDecoder[ApiKeyList] = jsonOf[ApiKeyList]
  implicit val ApiKeyListEncoder: EntityEncoder[ApiKeyList] = jsonEncoderOf[ApiKeyList]
}
