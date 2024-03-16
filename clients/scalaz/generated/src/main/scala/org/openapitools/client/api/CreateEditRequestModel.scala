package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CreateEditRequestModel._

case class CreateEditRequestModel (
  
object CreateEditRequestModel {
  import DateTimeCodecs._

  implicit val CreateEditRequestModelCodecJson: CodecJson[CreateEditRequestModel] = CodecJson.derive[CreateEditRequestModel]
  implicit val CreateEditRequestModelDecoder: EntityDecoder[CreateEditRequestModel] = jsonOf[CreateEditRequestModel]
  implicit val CreateEditRequestModelEncoder: EntityEncoder[CreateEditRequestModel] = jsonEncoderOf[CreateEditRequestModel]
}
