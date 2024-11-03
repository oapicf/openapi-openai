package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ListThreadsResponse._

case class ListThreadsResponse (
  `object`: String,
data: List[ThreadObject],
firstId: String,
lastId: String,
hasMore: Boolean)

object ListThreadsResponse {
  import DateTimeCodecs._

  implicit val ListThreadsResponseCodecJson: CodecJson[ListThreadsResponse] = CodecJson.derive[ListThreadsResponse]
  implicit val ListThreadsResponseDecoder: EntityDecoder[ListThreadsResponse] = jsonOf[ListThreadsResponse]
  implicit val ListThreadsResponseEncoder: EntityEncoder[ListThreadsResponse] = jsonEncoderOf[ListThreadsResponse]
}
