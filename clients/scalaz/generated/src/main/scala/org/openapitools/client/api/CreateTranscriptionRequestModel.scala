package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CreateTranscriptionRequestModel._

case class CreateTranscriptionRequestModel (
  
object CreateTranscriptionRequestModel {
  import DateTimeCodecs._

  implicit val CreateTranscriptionRequestModelCodecJson: CodecJson[CreateTranscriptionRequestModel] = CodecJson.derive[CreateTranscriptionRequestModel]
  implicit val CreateTranscriptionRequestModelDecoder: EntityDecoder[CreateTranscriptionRequestModel] = jsonOf[CreateTranscriptionRequestModel]
  implicit val CreateTranscriptionRequestModelEncoder: EntityEncoder[CreateTranscriptionRequestModel] = jsonEncoderOf[CreateTranscriptionRequestModel]
}
