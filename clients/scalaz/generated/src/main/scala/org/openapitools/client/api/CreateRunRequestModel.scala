package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CreateRunRequestModel._

case class CreateRunRequestModel (
  
object CreateRunRequestModel {
  import DateTimeCodecs._

  implicit val CreateRunRequestModelCodecJson: CodecJson[CreateRunRequestModel] = CodecJson.derive[CreateRunRequestModel]
  implicit val CreateRunRequestModelDecoder: EntityDecoder[CreateRunRequestModel] = jsonOf[CreateRunRequestModel]
  implicit val CreateRunRequestModelEncoder: EntityEncoder[CreateRunRequestModel] = jsonEncoderOf[CreateRunRequestModel]
}
