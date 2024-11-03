package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ListRunStepsResponse._

case class ListRunStepsResponse (
  `object`: String,
data: List[RunStepObject],
firstId: String,
lastId: String,
hasMore: Boolean)

object ListRunStepsResponse {
  import DateTimeCodecs._

  implicit val ListRunStepsResponseCodecJson: CodecJson[ListRunStepsResponse] = CodecJson.derive[ListRunStepsResponse]
  implicit val ListRunStepsResponseDecoder: EntityDecoder[ListRunStepsResponse] = jsonOf[ListRunStepsResponse]
  implicit val ListRunStepsResponseEncoder: EntityEncoder[ListRunStepsResponse] = jsonEncoderOf[ListRunStepsResponse]
}
