package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CreateSpeechRequestModel._

case class CreateSpeechRequestModel (
  
object CreateSpeechRequestModel {
  import DateTimeCodecs._

  implicit val CreateSpeechRequestModelCodecJson: CodecJson[CreateSpeechRequestModel] = CodecJson.derive[CreateSpeechRequestModel]
  implicit val CreateSpeechRequestModelDecoder: EntityDecoder[CreateSpeechRequestModel] = jsonOf[CreateSpeechRequestModel]
  implicit val CreateSpeechRequestModelEncoder: EntityEncoder[CreateSpeechRequestModel] = jsonEncoderOf[CreateSpeechRequestModel]
}
