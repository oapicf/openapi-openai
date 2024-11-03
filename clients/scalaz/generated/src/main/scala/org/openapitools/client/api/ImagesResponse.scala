package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ImagesResponse._

case class ImagesResponse (
  created: Integer,
data: List[Image])

object ImagesResponse {
  import DateTimeCodecs._

  implicit val ImagesResponseCodecJson: CodecJson[ImagesResponse] = CodecJson.derive[ImagesResponse]
  implicit val ImagesResponseDecoder: EntityDecoder[ImagesResponse] = jsonOf[ImagesResponse]
  implicit val ImagesResponseEncoder: EntityEncoder[ImagesResponse] = jsonEncoderOf[ImagesResponse]
}
