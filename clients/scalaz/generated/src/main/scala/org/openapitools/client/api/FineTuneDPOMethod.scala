package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import FineTuneDPOMethod._

case class FineTuneDPOMethod (
  hyperparameters: Option[FineTuneDPOMethodHyperparameters])

object FineTuneDPOMethod {
  import DateTimeCodecs._

  implicit val FineTuneDPOMethodCodecJson: CodecJson[FineTuneDPOMethod] = CodecJson.derive[FineTuneDPOMethod]
  implicit val FineTuneDPOMethodDecoder: EntityDecoder[FineTuneDPOMethod] = jsonOf[FineTuneDPOMethod]
  implicit val FineTuneDPOMethodEncoder: EntityEncoder[FineTuneDPOMethod] = jsonEncoderOf[FineTuneDPOMethod]
}
