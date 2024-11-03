package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ListMessagesResponse._

case class ListMessagesResponse (
  `object`: String,
data: List[MessageObject],
firstId: String,
lastId: String,
hasMore: Boolean)

object ListMessagesResponse {
  import DateTimeCodecs._

  implicit val ListMessagesResponseCodecJson: CodecJson[ListMessagesResponse] = CodecJson.derive[ListMessagesResponse]
  implicit val ListMessagesResponseDecoder: EntityDecoder[ListMessagesResponse] = jsonOf[ListMessagesResponse]
  implicit val ListMessagesResponseEncoder: EntityEncoder[ListMessagesResponse] = jsonEncoderOf[ListMessagesResponse]
}
