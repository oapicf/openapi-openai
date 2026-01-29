package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ListRunsResponse._

case class ListRunsResponse (
  `object`: String,
data: List[RunObject],
firstId: String,
lastId: String,
hasMore: Boolean)

object ListRunsResponse {
  import DateTimeCodecs._

  implicit val ListRunsResponseCodecJson: CodecJson[ListRunsResponse] = CodecJson.derive[ListRunsResponse]
  implicit val ListRunsResponseDecoder: EntityDecoder[ListRunsResponse] = jsonOf[ListRunsResponse]
  implicit val ListRunsResponseEncoder: EntityEncoder[ListRunsResponse] = jsonEncoderOf[ListRunsResponse]
}
