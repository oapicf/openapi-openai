package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import FineTune._

case class FineTune (
  id: String,
`object`: String,
createdAt: Integer,
updatedAt: Integer,
model: String,
fineTunedModel: String,
organizationId: String,
status: String,
hyperparams: Any,
trainingFiles: List[OpenAIFile],
validationFiles: List[OpenAIFile],
resultFiles: List[OpenAIFile],
events: Option[List[FineTuneEvent]])

object FineTune {
  import DateTimeCodecs._

  implicit val FineTuneCodecJson: CodecJson[FineTune] = CodecJson.derive[FineTune]
  implicit val FineTuneDecoder: EntityDecoder[FineTune] = jsonOf[FineTune]
  implicit val FineTuneEncoder: EntityEncoder[FineTune] = jsonEncoderOf[FineTune]
}
