package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CreateAssistantRequestModel._

case class CreateAssistantRequestModel (
  
object CreateAssistantRequestModel {
  import DateTimeCodecs._

  implicit val CreateAssistantRequestModelCodecJson: CodecJson[CreateAssistantRequestModel] = CodecJson.derive[CreateAssistantRequestModel]
  implicit val CreateAssistantRequestModelDecoder: EntityDecoder[CreateAssistantRequestModel] = jsonOf[CreateAssistantRequestModel]
  implicit val CreateAssistantRequestModelEncoder: EntityEncoder[CreateAssistantRequestModel] = jsonEncoderOf[CreateAssistantRequestModel]
}
