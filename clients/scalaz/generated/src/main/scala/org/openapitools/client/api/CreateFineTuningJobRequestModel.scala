package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CreateFineTuningJobRequestModel._

case class CreateFineTuningJobRequestModel (
  
object CreateFineTuningJobRequestModel {
  import DateTimeCodecs._

  implicit val CreateFineTuningJobRequestModelCodecJson: CodecJson[CreateFineTuningJobRequestModel] = CodecJson.derive[CreateFineTuningJobRequestModel]
  implicit val CreateFineTuningJobRequestModelDecoder: EntityDecoder[CreateFineTuningJobRequestModel] = jsonOf[CreateFineTuningJobRequestModel]
  implicit val CreateFineTuningJobRequestModelEncoder: EntityEncoder[CreateFineTuningJobRequestModel] = jsonEncoderOf[CreateFineTuningJobRequestModel]
}
