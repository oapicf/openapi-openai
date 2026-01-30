package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AudioResponseFormat._

case class AudioResponseFormat (
  
object AudioResponseFormat {
  import DateTimeCodecs._

  implicit val AudioResponseFormatCodecJson: CodecJson[AudioResponseFormat] = CodecJson.derive[AudioResponseFormat]
  implicit val AudioResponseFormatDecoder: EntityDecoder[AudioResponseFormat] = jsonOf[AudioResponseFormat]
  implicit val AudioResponseFormatEncoder: EntityEncoder[AudioResponseFormat] = jsonEncoderOf[AudioResponseFormat]
}
