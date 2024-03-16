package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CreateFineTuneRequestModel._

case class CreateFineTuneRequestModel (
  
object CreateFineTuneRequestModel {
  import DateTimeCodecs._

  implicit val CreateFineTuneRequestModelCodecJson: CodecJson[CreateFineTuneRequestModel] = CodecJson.derive[CreateFineTuneRequestModel]
  implicit val CreateFineTuneRequestModelDecoder: EntityDecoder[CreateFineTuneRequestModel] = jsonOf[CreateFineTuneRequestModel]
  implicit val CreateFineTuneRequestModelEncoder: EntityEncoder[CreateFineTuneRequestModel] = jsonEncoderOf[CreateFineTuneRequestModel]
}
