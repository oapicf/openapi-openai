package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import FineTuneSupervisedMethod._

case class FineTuneSupervisedMethod (
  hyperparameters: Option[FineTuneSupervisedMethodHyperparameters])

object FineTuneSupervisedMethod {
  import DateTimeCodecs._

  implicit val FineTuneSupervisedMethodCodecJson: CodecJson[FineTuneSupervisedMethod] = CodecJson.derive[FineTuneSupervisedMethod]
  implicit val FineTuneSupervisedMethodDecoder: EntityDecoder[FineTuneSupervisedMethod] = jsonOf[FineTuneSupervisedMethod]
  implicit val FineTuneSupervisedMethodEncoder: EntityEncoder[FineTuneSupervisedMethod] = jsonEncoderOf[FineTuneSupervisedMethod]
}
