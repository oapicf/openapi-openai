package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CreateImageRequestModel._

case class CreateImageRequestModel (
  
object CreateImageRequestModel {
  import DateTimeCodecs._

  implicit val CreateImageRequestModelCodecJson: CodecJson[CreateImageRequestModel] = CodecJson.derive[CreateImageRequestModel]
  implicit val CreateImageRequestModelDecoder: EntityDecoder[CreateImageRequestModel] = jsonOf[CreateImageRequestModel]
  implicit val CreateImageRequestModelEncoder: EntityEncoder[CreateImageRequestModel] = jsonEncoderOf[CreateImageRequestModel]
}
