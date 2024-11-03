package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CreateImageEditRequestModel._

case class CreateImageEditRequestModel (
  
object CreateImageEditRequestModel {
  import DateTimeCodecs._

  implicit val CreateImageEditRequestModelCodecJson: CodecJson[CreateImageEditRequestModel] = CodecJson.derive[CreateImageEditRequestModel]
  implicit val CreateImageEditRequestModelDecoder: EntityDecoder[CreateImageEditRequestModel] = jsonOf[CreateImageEditRequestModel]
  implicit val CreateImageEditRequestModelEncoder: EntityEncoder[CreateImageEditRequestModel] = jsonEncoderOf[CreateImageEditRequestModel]
}
