package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ListFineTuneEventsResponse._

case class ListFineTuneEventsResponse (
  `object`: String,
data: List[FineTuneEvent])

object ListFineTuneEventsResponse {
  import DateTimeCodecs._

  implicit val ListFineTuneEventsResponseCodecJson: CodecJson[ListFineTuneEventsResponse] = CodecJson.derive[ListFineTuneEventsResponse]
  implicit val ListFineTuneEventsResponseDecoder: EntityDecoder[ListFineTuneEventsResponse] = jsonOf[ListFineTuneEventsResponse]
  implicit val ListFineTuneEventsResponseEncoder: EntityEncoder[ListFineTuneEventsResponse] = jsonEncoderOf[ListFineTuneEventsResponse]
}
