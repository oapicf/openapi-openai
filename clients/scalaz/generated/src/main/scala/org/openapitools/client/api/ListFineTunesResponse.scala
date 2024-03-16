package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ListFineTunesResponse._

case class ListFineTunesResponse (
  `object`: String,
data: List[FineTune])

object ListFineTunesResponse {
  import DateTimeCodecs._

  implicit val ListFineTunesResponseCodecJson: CodecJson[ListFineTunesResponse] = CodecJson.derive[ListFineTunesResponse]
  implicit val ListFineTunesResponseDecoder: EntityDecoder[ListFineTunesResponse] = jsonOf[ListFineTunesResponse]
  implicit val ListFineTunesResponseEncoder: EntityEncoder[ListFineTunesResponse] = jsonEncoderOf[ListFineTunesResponse]
}
